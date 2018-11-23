/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Aluno;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luiz Oliveira
 */
public class AlunoDAOTest {
    
    public AlunoDAOTest() {
    }

    @Test
    public void inserir() {
        
        Aluno al = new Aluno("Luiz", "433.331.778-97", "1234", 3, "luiz@email.com", "143048", "manhã", 4, "ADS");
        AlunoDAO dao = new AlunoDAO();
        if (dao.save(al)){
            System.out.println("Salvo com sucesso!");            
        } else {
            fail("Erro na inserção!");
        }
    }
}
