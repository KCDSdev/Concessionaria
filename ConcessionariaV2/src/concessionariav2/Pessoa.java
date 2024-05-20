/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariav2;

/**
 *
 * @author Kleber
 */
public class Pessoa {
    
    private int codPessoa;
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private Contato contato;

    public Pessoa(int codPessoa, String nome, String endereco, String cidade, String estado, Contato contato) {
        this.codPessoa = codPessoa;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.contato = contato;
    }


    public int getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("codPessoa=").append(codPessoa);
        sb.append(", nome=").append(nome);
        sb.append(", endereco=").append(endereco);
        sb.append(", cidade=").append(cidade);
        sb.append(", estado=").append(estado);
        sb.append(", contato=").append(contato);
        sb.append('}');
        return sb.toString();
    }

   

    
    
    
    
    
}
