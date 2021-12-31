package com.maven.testejava.SigaBem.viewmodels;

import com.maven.testejava.SigaBem.model.ConsultaFrete;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsultaViewModel {
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private double peso;
    private String cepOrigem;
    private String cepDestino;
    private String nomeDestinatario;
    private double vlTotalFrete;
    private String dataPrevistaEntrega;
    private String dataConsulta;

    public ConsultaViewModel(ConsultaFrete consulta) {
        this.peso = consulta.getPeso();
        this.cepOrigem = consulta.getCepOrigem();
        this.cepDestino = consulta.getCepDestino();
        this.nomeDestinatario = consulta.getNomeDestinatario();
        this.vlTotalFrete = consulta.getVlTotalFrete();
        this.dataConsulta = sdf.format(consulta.getDataConsulta());
        this.dataPrevistaEntrega = sdf.format(consulta.getDataPrevistaEntrega());
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

    public String getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }

    public void setDataPrevistaEntrega(String dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
}
