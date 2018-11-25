/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Luiz Oliveira
 */
public class PessoaDAOTest {
    
    public PessoaDAOTest() {
    }

    @Test
    @Ignore
    public void inserir() {
        
        Pessoa pessoa = new Pessoa("012.345.678-90", "Ciro Cerne", "cirocompilador@compilatudo.com", 2, "1234");
        PessoaDAO dao = new PessoaDAO();
        if (dao.save(pessoa)){
            System.out.println("Salvo com sucesso!");            
        } else {
            fail("Erro na inserção!");
        }
    }
    
    @Test
    @Ignore
    public void update() {
        PessoaDAO dao = new PessoaDAO();
        Pessoa pessoa = new Pessoa("012.345.678-90", "Ciro Cerne Trindade", "cirocompilador@compilatudo.com", 2, "1234");
        String cpf = "01234567890";
        if (dao.alterar(pessoa, cpf))
            System.out.println("Atualizado com sucesso!");
        else
            fail("Erro na atualização");
        
    }
    
    @Test
    @Ignore
    public void deletar(){
    
        PessoaDAO dao = new PessoaDAO();
        if(dao.deletar("01234567890"))
            System.out.println("Deletado com sucesso!");
        else
            fail("Erro na deleção");
        
    }
}
