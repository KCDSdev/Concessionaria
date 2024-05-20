/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariav2;

/**
 *
 * @author Kleber
 */
public class Contato {
    private int ddd;
    private String telefone1;
    private String telefone2;
    private String email;

    public Contato(int ddd, String telefone1, String email) {
        this.ddd = ddd;
        this.telefone1 = telefone1;
        this.email = email;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contato{");
        sb.append("ddd=").append(ddd);
        sb.append(", telefone1=").append(telefone1);
        sb.append(", telefone2=").append(telefone2);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }
    
    
}
