package com.maven.testejava.SigaBem.service;

import com.maven.testejava.SigaBem.viewmodels.CalcularFreteViewModel;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface EnderecoService {

    CalcularFreteViewModel calcularFrete(double peso, String cepOrigem, String cepDestino, String nomeDestinatario) throws NotFoundException;

}
