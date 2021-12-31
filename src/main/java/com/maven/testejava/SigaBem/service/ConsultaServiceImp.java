package com.maven.testejava.SigaBem.service;

import com.maven.testejava.SigaBem.model.ConsultaFrete;
import com.maven.testejava.SigaBem.repository.ConsultaFreteIRepository;
import com.maven.testejava.SigaBem.viewmodels.ConsultaViewModel;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConsultaServiceImp implements ConsultaService{
    private final ConsultaFreteIRepository consultaFreteIRepository;

    public ConsultaServiceImp(ConsultaFreteIRepository consultaFreteIRepository) {
        this.consultaFreteIRepository = consultaFreteIRepository;
    }

    @Override
    public List<ConsultaViewModel> getAllConsultas() {
        List<ConsultaFrete> consultas = consultaFreteIRepository.findAll();
        return consultas.stream().map(ConsultaViewModel::new).collect(Collectors.toList());
    }
}
