package com.maven.testejava.SigaBem.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "consulta")
public class ConsultaFrete{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private double peso;
    @Column(nullable = false, length = 8)
    private String cepOrigem;
    @Column(nullable = false, length = 8)
    private String cepDestino;
    @Column(nullable = false)
    private String nomeDestinatario;
    @Column(nullable = false)
    private double vlTotalFrete;
    @Column(nullable = false)
    private Date dataPrevistaEntrega;
    @Column(nullable = false)
    private Date dataConsulta;

    public ConsultaFrete(double peso, String cepOrigem, String cepDestino, String nomeDestinatario, double vlTotalFrete,Date dataConsulta) {
        this.peso = peso;
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
        this.nomeDestinatario = nomeDestinatario;
        this.vlTotalFrete = vlTotalFrete;
        this.dataConsulta = dataConsulta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCepOrigem() {
        return cepOrigem;
    }

    public void setCepOrigem(String cepOrigem) {
        this.cepOrigem = cepOrigem;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public void setCepDestino(String cepDestino) {
        this.cepDestino = cepDestino;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public double getVlTotalFrete() {
        return vlTotalFrete;
    }

    public void setVlTotalFrete(double vlTotalFrete) {
        this.vlTotalFrete = vlTotalFrete;
    }

    public Date getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }

    public void setDataPrevistaEntrega(Date dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }


}
