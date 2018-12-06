/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luiz Oliveira
 */
public class CursoDAOTest {
    
    public CursoDAOTest() {
    }

    @Test
    public void testSomeMethod() {
        String nomeCurso = "Secretariado";
        CursoDAO dao = new CursoDAO();
        int cod = 0;
        
        if ((cod = dao.selectCod(nomeCurso)) > 0){
            System.out.println("Codigo: " + cod);
        }
        else {
            fail("Erro ");
        }
            
    }
    
}
