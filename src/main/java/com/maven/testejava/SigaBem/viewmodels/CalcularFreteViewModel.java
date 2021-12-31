package com.maven.testejava.SigaBem.viewmodels;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcularFreteViewModel {
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private double vlTotalFrete;
    private String dataPrevistaEntrega;
    private String cepOrigem;
    private String cepDestino;

    public CalcularFreteViewModel(double vlTotalFrete, Date dataPrevistaEntrega, String cepOrigem, String cepDestino) {
        this.vlTotalFrete = vlTotalFrete;
        this.dataPrevistaEntrega = sdf.format(dataPrevistaEntrega);
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
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
}
