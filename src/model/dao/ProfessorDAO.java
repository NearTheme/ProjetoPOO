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
import model.bean.Pessoa;
import model.bean.Professor;

/**
 *
 * @author Eduardo Soares
 */
public class ProfessorDAO {

    private Connection con = null;

    public ProfessorDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(Professor professor) {
        
        String sql = "INSERT INTO pessoa (cpf, nome, email, perfil, senha) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        String sql2 = "INSERT INTO professores (rm, formacao, especializacao, horasdedicacao) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt2 = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, professor.getCpf());
            stmt.setString(2, professor.getNome());
            stmt.setString(3, professor.getEmail());
            stmt.setInt(4, professor.getPerfil());
            stmt.setString(5, professor.getSenha());
            stmt.executeUpdate();      
            stmt2 = con.prepareStatement(sql2);
            stmt2.setString(1, professor.getRm());
            stmt2.setString(2, professor.getFormacao());
            stmt2.setString(3, professor.getEspecializacao());
            stmt2.setInt(4, professor.getHorasdedicacao());
            stmt2.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
            ConnectionFactory.closeConnection(con, stmt2);
        }
    }

    public Professor selecionar(String campo1) {
        Professor prof = new Professor();
        String sql = "SELECT * FROM professores "
                + "WHERE rm = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, campo1);
            rs = stmt.executeQuery();
            while (rs.next()) {
                prof.setRm(rs.getString("rm"));
                prof.setFormacao(rs.getString("formacao"));
                prof.setEspecializacao(rs.getString("especializacao"));
                prof.setHorasdedicacao(rs.getInt("horasdedicacao"));
            }

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return prof;
    }
    public boolean alterar(Professor professor, String OldRM) {
        ProfessorDAO dao = new ProfessorDAO();
        String sql = "UPDATE professores "
                + "SET rm = ?, formacao = ?, especializacao = ?, horasdedicacao = ?"
                + "WHERE rm = " + OldRM;
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, professor.getRm());
            stmt.setString(2, professor.getFormacao());
            stmt.setString(3, professor.getEspecializacao());
            stmt.setInt(4, professor.getHorasdedicacao());
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public boolean deletar(String delrm) {

        ProfessorDAO dao = new ProfessorDAO();
        String sql = "DELETE FROM professores "
                + "WHERE rm = " + delrm;
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
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
