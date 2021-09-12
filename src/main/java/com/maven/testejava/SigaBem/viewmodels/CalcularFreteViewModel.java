package com.maven.testejava.SigaBem.viewmodels;

import java.util.Date;


public class CalcularFreteViewModel {
    public double vlTotalFrete;

    public CalcularFreteViewModel(double vlTotalFrete, Date dataPrevistaEntrega, String cepOrigem, String cepDestino) {
        this.vlTotalFrete = vlTotalFrete;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
    }

    public Date dataPrevistaEntrega;
    public String cepOrigem;
    public String cepDestino;
}
