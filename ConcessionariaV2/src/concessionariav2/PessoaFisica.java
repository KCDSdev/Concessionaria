/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariav2;

/**
 *
 * @author Kleber
 */
public class PessoaFisica extends Pessoa{
    
    private String rg;
    private String cpf;
    private char genero;

    public PessoaFisica(String rg, String cpf, char genero, int codPessoa, String nome, String endereco, String cidade, String estado, Contato contato) {
        super(codPessoa, nome, endereco, cidade, estado, contato);
        this.rg = rg;
        this.cpf = cpf;
        this.genero = genero;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PessoaFisica{");
        sb.append("rg=").append(rg);
        sb.append(", cpf=").append(cpf);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }

    
}
