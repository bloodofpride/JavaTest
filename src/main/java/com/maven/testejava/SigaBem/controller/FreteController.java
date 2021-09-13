package com.maven.testejava.SigaBem.controller;

import com.maven.testejava.SigaBem.model.ConsultaFrete;
import com.maven.testejava.SigaBem.model.Endereco;
import com.maven.testejava.SigaBem.repository.ConsultaFreteIRepository;
import com.maven.testejava.SigaBem.service.EnderecoService;
import com.maven.testejava.SigaBem.viewmodels.CalcularFreteViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Controller
public class FreteController {
    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private ConsultaFreteIRepository repository;

    @GetMapping(path="/api/calcularfrete")
    @ResponseBody
    public CalcularFreteViewModel CalcularFrete(double peso, String cepOrigem, String cepDestino, String nomeDestinatario) {
        Endereco enderecoOrigem = enderecoService.buscarEndereco(cepOrigem);
        Endereco enderecoDestino = enderecoService.buscarEndereco(cepDestino);

        double vlTotalFrete = peso * 1;
        int previsaoDias = 0;

        if (enderecoOrigem.uf.equals(enderecoDestino.uf)) {
            if (enderecoOrigem.ddd.equals(enderecoDestino.ddd)) {
                vlTotalFrete = vlTotalFrete / 2;
                previsaoDias = 1;
            } else {
                vlTotalFrete = (vlTotalFrete * 3) / 4;
                previsaoDias = 3;
            }
        } else {
            previsaoDias = 10;
        }

        //criar o objeto vazio
        ConsultaFrete consulta = new ConsultaFrete();

        //preencher com as variaveis que encontrei
        consulta.nomeDestinatario = nomeDestinatario;
        consulta.cepOrigem = cepOrigem;
        consulta.cepDestino = cepDestino;
        consulta.vlTotalFrete = vlTotalFrete;
        consulta.peso = peso;
        consulta.dataConsulta = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(consulta.dataConsulta);
        c.add(Calendar.DATE, previsaoDias);
        consulta.dataPrevistaEntrega = c.getTime();

        //chamar o repository para salvar
        repository.save(consulta);

        //retorna as variavéis
        return new CalcularFreteViewModel(consulta.vlTotalFrete, consulta.dataPrevistaEntrega, consulta.cepOrigem, consulta.cepDestino);
    }
}
