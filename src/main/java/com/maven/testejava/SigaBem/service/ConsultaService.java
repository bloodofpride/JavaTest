package com.maven.testejava.SigaBem.service;

import com.maven.testejava.SigaBem.model.ConsultaFrete;
import com.maven.testejava.SigaBem.viewmodels.ConsultaViewModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ConsultaService {
    List<ConsultaViewModel> getAllConsultas();
}
