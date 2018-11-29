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
import model.bean.Curso;

/**
 *
 * @author Eduardo Soares
 */
public class CursoDAO {

    private Connection con = null;

    public CursoDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(Curso curso) {
        String sql = "INSERT INTO cursos (codigo, nome, horario, datainicio, datafim) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, curso.getCodigo());
            stmt.setString(2, curso.getNome());
            stmt.setString(3, curso.getHorario());
            stmt.setString(4, curso.getDatainicio());
            stmt.setString(5, curso.getDatafim());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public Curso selecionar(int campo1) {
        Curso curso = new Curso();
        String sql = "SELECT * FROM cursos "
                + "WHERE codigo = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, campo1);
            rs = stmt.executeQuery();
            while (rs.next()) {
                curso.setCodigo(rs.getInt("codigo"));
                curso.setNome(rs.getString("nome"));
                curso.setHorario(rs.getString("horario"));
                curso.setDatainicio(rs.getString("datainicio"));
                curso.setDatafim(rs.getString("datafim"));
            }

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return curso;
    }

    public boolean alterar(Curso curso, int Oldcodigo) {
        CursoDAO dao = new CursoDAO();
        String sql = "UPDATE cursos "
                + "SET codigo = ?, nome = ?, horario = ?, datainicio = ?, datafim = ?"
                + "WHERE ra = " + Oldcodigo;
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, curso.getCodigo());
            stmt.setString(2, curso.getNome());
            stmt.setString(3, curso.getHorario());
            stmt.setString(4, curso.getDatainicio());
            stmt.setString(5, curso.getDatafim());
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {

            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public boolean deletar(int delcodigo) {

        CursoDAO dao = new CursoDAO();
        String sql = "DELETE FROM cursos "
                + "WHERE codigo = " + delcodigo;
        
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
