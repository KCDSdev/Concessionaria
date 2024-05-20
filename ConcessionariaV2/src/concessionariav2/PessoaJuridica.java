/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariav2;

/**
 *
 * @author Kleber
 */
public class PessoaJuridica extends Pessoa{
    
    private String cnpj;

    public PessoaJuridica(String cnpj, int codPessoa, String nome, String endereco, String cidade, String estado, Contato contato) {
        super(codPessoa, nome, endereco, cidade, estado, contato);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PessoaJuridica{");
        sb.append("cnpj=").append(cnpj);
        sb.append('}');
        return sb.toString();
    }

        
    
}
