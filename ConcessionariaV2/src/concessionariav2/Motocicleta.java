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
public class Motocicleta extends Veiculo{
    
    private int cilindrada;
    private String tipoMotor;

    public Motocicleta(int cilindrada, String tipoMotor, String fabricante, String modelo, Date anoFabricacao, Date anoModelo, int km, float valor) {
        super(fabricante, modelo, anoFabricacao, anoModelo, km, valor);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }


    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motocicleta{");
        sb.append("cilindrada=").append(cilindrada);
        sb.append(", tipoMotor=").append(tipoMotor);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
