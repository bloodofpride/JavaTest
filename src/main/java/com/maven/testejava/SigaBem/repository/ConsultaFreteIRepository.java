package com.maven.testejava.SigaBem.repository;

import com.maven.testejava.SigaBem.model.ConsultaFrete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ConsultaFreteIRepository extends JpaRepository<ConsultaFrete, Long> {

}
