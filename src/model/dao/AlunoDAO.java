/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public Aluno selecionar(String campo1) {
        Aluno alu = new Aluno();
        String sql = "SELECT * FROM alunos "
                + "WHERE ra = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, campo1);
            rs = stmt.executeQuery();
            while (rs.next()) {
                alu.setRa(rs.getString("ra"));
                alu.setNome(rs.getString("nome"));
                alu.setCpf(rs.getString("cpf"));
                alu.setCurso(rs.getString("curso"));
                alu.setSemestre(rs.getInt("semestre"));
                alu.setSenha(rs.getString("senha"));
                alu.setPerfil(rs.getInt("perfil"));
                alu.setHorario(rs.getString("horario"));
                alu.setEmail(rs.getString("email"));
            }

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return alu;
    }
    
    public boolean alterar (Aluno aluno, String OldRA){
        AlunoDAO dao = new AlunoDAO();
        String sql = "UPDATE alunos "
                      + "SET ra = ?, nome = ?, curso = ?, cpf = ?, semestre = ?, horario = ?, email = ?"
                       + "WHERE ra = " + OldRA;
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, aluno.getRa());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getCurso());
            stmt.setString(4, aluno.getCpf());
            stmt.setInt(5, aluno.getSemestre());
            stmt.setString(6, aluno.getHorario());
            stmt.setString(7, aluno.getEmail());
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
