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
public class Caminhao extends Veiculo{
    
    private float capacidadeCarga;
    private String tipoCaminhao;

    public Caminhao(String fabricante, String modelo, Date anoFabricacao, Date anoModelo, int km, float valor) {
        super(fabricante, modelo, anoFabricacao, anoModelo, km, valor);
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public void setTipoCaminhao(String tipoCaminhao) {
        this.tipoCaminhao = tipoCaminhao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Caminhao{");
        sb.append("capacidadeCarga=").append(capacidadeCarga);
        sb.append(", tipoCaminhao=").append(tipoCaminhao);
        sb.append('}');
        return sb.toString();
    }  
}
