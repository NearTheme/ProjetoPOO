/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.Aluno;

/**
 *
 * @author Luiz Oliveira
 */
public class AlunoDAO {

    private Connection con = null;

    public AlunoDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(Aluno aluno) {
        String sql = "INSERT INTO alunos (email, ra, cpf, nome, senha, perfil, curso, horario, semestre) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, aluno.getEmail());
            stmt.setString(2, aluno.getRa());
            stmt.setString(3, aluno.getCpf());
            stmt.setString(4, aluno.getNome());
            stmt.setString(5, aluno.getSenha());
            stmt.setInt(6, aluno.getPerfil());
            stmt.setString(7, aluno.getCurso());
            stmt.setString(8, aluno.getHorario());
            stmt.setInt(9, aluno.getSemestre());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}
