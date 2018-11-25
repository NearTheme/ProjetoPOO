/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Professor;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Luiz Oliveira
 */
public class ProfessorDAOTest {
    
    public ProfessorDAOTest() {
    }

    @Test
    @Ignore
    public void inserir() {
        
        Professor prof = new Professor("1440501812001", "Engenharia da Computacao", "Doutorado", 360);
        ProfessorDAO dao = new ProfessorDAO();
        if (dao.save(prof)){
            System.out.println("Salvo com sucesso!");            
        } else {
            fail("Erro na inserção!");
        }
    }
    
    @Test
    @Ignore
    public void update() {
        ProfessorDAO dao = new ProfessorDAO();
        Professor prof = new Professor("1440501812001", "Engenharia da Computacao", "Mestrado", 360);
        String cpf = "01234567890";
        if (dao.alterar(prof, cpf))
            System.out.println("Atualizado com sucesso!");
        else
            fail("Erro na atualização");
        
    }
    
    @Test
    @Ignore
    public void deletar(){
    
        ProfessorDAO dao = new ProfessorDAO();
        if(dao.deletar("01234567890"))
            System.out.println("Deletado com sucesso!");
        else
            fail("Erro na deleção");
        
    }
}
