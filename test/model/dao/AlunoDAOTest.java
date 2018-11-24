/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Aluno;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Luiz Oliveira
 */
public class AlunoDAOTest {
    
    public AlunoDAOTest() {
    }

    @Test
    @Ignore
    public void inserir() {
        
        Aluno al = new Aluno("Luiz", "433.331.778-98", "1234", 3, "luiz@email.com", "143048033", "manhã", 4, "ADS");
        AlunoDAO dao = new AlunoDAO();
        if (dao.save(al)){
            System.out.println("Salvo com sucesso!");            
        } else {
            fail("Erro na inserção!");
        }
    }
    
    @Test
    @Ignore
    public void update() {
        AlunoDAO dao = new AlunoDAO();
        Aluno al = new Aluno("Daniel Mezalira", "1234", "12345", 3, "Daniel@mezalira", "157420", "Noite", 4, "ADS");
        String ra = "157420";
        if (dao.alterar(al, ra))
            System.out.println("Atualizado com sucesso!");
        else
            fail("Erro na atualização");
        
    }
    
}
