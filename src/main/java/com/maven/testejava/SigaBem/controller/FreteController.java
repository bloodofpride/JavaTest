package com.maven.testejava.SigaBem.controller;

import com.maven.testejava.SigaBem.service.EnderecoService;
import com.maven.testejava.SigaBem.viewmodels.CalcularFreteViewModel;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recursosFrete")
public class FreteController {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping(path="calcularfrete/{peso}/{cepOrigem}/{cepDestino}/{nomeDestinatario}")
    public CalcularFreteViewModel CalcularFrete(@PathVariable double peso, @PathVariable String cepOrigem, @PathVariable String cepDestino, @PathVariable String nomeDestinatario) throws NotFoundException {
        return enderecoService.calcularFrete(peso, cepOrigem, cepDestino, nomeDestinatario);
    }
}
