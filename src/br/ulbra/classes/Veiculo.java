/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.classes;

/**
 *
 * @author Leon
 */
public class Veiculo {

    private String modelo;
    private String marca;
    private int anoMod;
    private int anoFab;
    private double valorFab;
    private double valorVar;
    private boolean ipvaPago;
    private boolean quitado;

    public Veiculo() {
    }

    public Veiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public Veiculo(String modelo, String marca, int anoMod, int anoFab, double valorFab, double valorVar, boolean ipvaPago, boolean quitado) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoMod = anoMod;
        this.anoFab = anoFab;
        this.valorFab = valorFab;
        this.valorVar = valorVar;
        this.ipvaPago = ipvaPago;
        this.quitado = quitado;
    }

 
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoMod() {
        return anoMod;
    }

    public void setAnoMod(int anoMod) {
        this.anoMod = anoMod;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public double getValorFab() {
        return valorFab;
    }

    public void setValorFab(double valorFab) {
        this.valorFab = valorFab;
    }

    public double getValorVar() {
        return valorVar;
    }

    public void setValorVar(double valorVar) {
        this.valorVar = valorVar;
    }

    public boolean isIpvaPago() {
        return ipvaPago;
    }

    public void setIpvaPago(boolean ipvaPago) {
        this.ipvaPago = ipvaPago;
    }

    public boolean isQuitado() {
        return quitado;
    }

    public void setQuitado(boolean quitado) {
        this.quitado = quitado;
    }

}
