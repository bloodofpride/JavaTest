package com.maven.testejava.SigaBem.service;

import com.maven.testejava.SigaBem.model.Endereco;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnderecoService {
  public Endereco buscarEndereco(String cep) {
      RestTemplate restTemplate = new RestTemplate();
      RestTemplateBuilder restemplatebuilder = new RestTemplateBuilder();
      restTemplate = restemplatebuilder.build();

      Endereco endereco = restTemplate.getForObject("https://viacep.com.br/ws/"+cep+"/json/", Endereco.class);
      return endereco;
  }
}
