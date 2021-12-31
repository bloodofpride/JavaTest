package com.maven.testejava.SigaBem.service;

import com.maven.testejava.SigaBem.model.ConsultaFrete;
import com.maven.testejava.SigaBem.model.Endereco;
import com.maven.testejava.SigaBem.repository.ConsultaFreteIRepository;
import com.maven.testejava.SigaBem.utils.DataUtils;
import com.maven.testejava.SigaBem.viewmodels.CalcularFreteViewModel;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service

public class EnderecoServiceImp implements EnderecoService{
    private final ConsultaFreteIRepository consultaFreteIRepository;

    public EnderecoServiceImp(ConsultaFreteIRepository consultaFreteIRepository) {
        this.consultaFreteIRepository = consultaFreteIRepository;
    }

    @Override
    public CalcularFreteViewModel calcularFrete(double peso, String cepOrigem, String cepDestino, String nomeDestinatario) throws NotFoundException {
        Endereco enderecoOrigem = buscarEndereco(cepOrigem);
        Endereco enderecoDestino = buscarEndereco(cepDestino);

        double vlTotalFrete = peso * 1;
        int previsaoDias = 0;

        if (enderecoOrigem.getUf().equals(enderecoDestino.getUf())) {
            vlTotalFrete /= 4;
            previsaoDias = 3;
            if (enderecoOrigem.getDdd().equals(enderecoDestino.getDdd())) {
                vlTotalFrete /= 2;
                previsaoDias = 1;
            }
        } else {
            previsaoDias = 10;
        }

        //criar o objeto vazio
        ConsultaFrete consulta = new ConsultaFrete(peso,cepOrigem,cepDestino,nomeDestinatario,vlTotalFrete, new Date());
        consulta.setDataPrevistaEntrega(DataUtils.adicionarDias(consulta.getDataConsulta(),previsaoDias));

        //chamar o repository para salvar
        consultaFreteIRepository.save(consulta);

        //retorna as variavéis
        return new CalcularFreteViewModel(consulta.getVlTotalFrete(), consulta.getDataPrevistaEntrega(), consulta.getCepOrigem(), consulta.getCepDestino());
    }

    public final Endereco buscarEndereco(String cep) throws NotFoundException {
        RestTemplate restTemplate = new RestTemplate();

        Endereco endereco = restTemplate.getForObject("https://viacep.com.br/ws/"+cep+"/json/", Endereco.class);
        if(endereco != null)
            return endereco;
        else
            throw new NotFoundException("Endereço não encontrado!");
    }
}
