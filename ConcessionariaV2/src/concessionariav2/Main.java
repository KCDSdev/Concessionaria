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
public class Main {
    public static void main(String[] args) {

        Estoque e = new Estoque();
        RepositorioPessoas r = new RepositorioPessoas();
        
        r.listaFuncionario.add(new Funcionario("Vendas", 1, "Bucetola", "Avenida Jacu", "Toma no cu city", "Arrombs",new Contato(151, "11111-1111", "bucetoldes@gmail.com")));

        
        
        
        
        System.out.println("");
        
        /*System.out.println(
                           """
                           Descricao do Funcionario:
                           Codigo de Funcionario:""" + r.listaFuncionario.get(0).getCodPessoa() +
                           "\nDepartamento:" + r.listaFuncionario.get(0).getDepartamento() +
                           "\nNome:" + r.listaFuncionario.get(0).getNome() + 
                           "\nEndereco:" + r.listaFuncionario.get(0).getEndereco() + 
                           "\nCidade:" + r.listaFuncionario.get(0).getCidade()  +
                           "\nDDD:" + r.listaFuncionario.get(0).getContato().getDdd() + 
                           "\nTelefone 1:" + r.listaFuncionario.get(0).getContato().getTelefone1() + 
                           "\nTelefone 2:" + r.listaFuncionario.get(0).getContato().getTelefone2() +         
                           "\nEmail:" + r.listaFuncionario.get(0).getContato().getEmail());*/

        
    }
}
