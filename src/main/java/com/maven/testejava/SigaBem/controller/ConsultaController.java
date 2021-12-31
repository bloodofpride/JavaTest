package com.maven.testejava.SigaBem.controller;

import com.maven.testejava.SigaBem.model.ConsultaFrete;
import com.maven.testejava.SigaBem.service.ConsultaService;
import com.maven.testejava.SigaBem.viewmodels.ConsultaViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recursosConsulta")
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    @GetMapping("/getAllConsultas")
    public ResponseEntity<List<ConsultaViewModel>> getAllConsultas(){
        return ResponseEntity.ok(consultaService.getAllConsultas());
    }

}
