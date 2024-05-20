/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariav2;

/**
 *
 * @author Kleber
 */
public class Funcionario extends Pessoa{
    
    private String departamento;

    public Funcionario(String departamento, int codPessoa, String nome, String endereco, String cidade, String estado, Contato contato) {
        super(codPessoa, nome, endereco, cidade, estado, contato);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcionario{");
        sb.append("departamento=").append(departamento);
        sb.append('}');
        return sb.toString();
    } 
}
