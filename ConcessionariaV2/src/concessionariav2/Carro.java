/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariav2;

import java.util.Date;

/**
 *
 * @author Kleber
 */
public class Carro extends Veiculo{
    private int numeroPortas;
    private String tipoCambio;
    private boolean arCondicionado;
    private int aro;
    private String tipoDirecao;

    public Carro(int numeroPortas, String tipoCambio, boolean arCondicionado, int aro, String tipoDirecao, String fabricante, String modelo, Date anoFabricacao, Date anoModelo, int km, float valor) {
        super(fabricante, modelo, anoFabricacao, anoModelo, km, valor);
        this.numeroPortas = numeroPortas;
        this.tipoCambio = tipoCambio;
        this.arCondicionado = arCondicionado;
        this.aro = aro;
        this.tipoDirecao = tipoDirecao;
    }

    

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getTipoDirecao() {
        return tipoDirecao;
    }

    public void setTipoDirecao(String tipoDirecao) {
        this.tipoDirecao = tipoDirecao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carro{");
        sb.append("numeroPortas=").append(numeroPortas);
        sb.append(", tipoCambio=").append(tipoCambio);
        sb.append(", arCondicionado=").append(arCondicionado);
        sb.append(", aro=").append(aro);
        sb.append(", tipoDirecao=").append(tipoDirecao);
        sb.append('}');
        return sb.toString();
    }

  
    
    
}
