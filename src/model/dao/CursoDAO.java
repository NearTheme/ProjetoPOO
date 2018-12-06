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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
        String sql = "INSERT INTO cursos (nome, horario, datainicio, datafim) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, curso.getNome());
            stmt.setString(2, curso.getHorario());
            stmt.setString(3, curso.getDatainicio());
            stmt.setString(4, curso.getDatafim());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar curso.");
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
            JOptionPane.showMessageDialog(null, "Erro ao selecionar o curso curso.");
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return curso;
    }
    
    public int selectCod (String nomeCurso) {
        String sql = "SELECT codigo FROM cursos " +
                     "WHERE nome = ?"; 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int cod = 0;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nomeCurso);
            rs = stmt.executeQuery();
            while (rs.next()){
                cod = rs.getInt("codigo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar o codigo do curso.");
            System.err.println("Erro: " + ex);
            return 0;
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cod;
        
    }

    public boolean alterar(Curso curso, int Oldcodigo) {
        String sql = "UPDATE cursos "
                + "SET nome = ?, horario = ?, datainicio = ?, datafim = ?"
                + "WHERE codigo = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, curso.getNome());
            stmt.setString(2, curso.getHorario());
            stmt.setString(3, curso.getDatainicio());
            stmt.setString(4, curso.getDatafim());
            stmt.setInt(5, Oldcodigo);
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar alterações.");
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
            JOptionPane.showMessageDialog(null, "Erro ao deletar curso.");
            System.err.println("Erro: " + ex);
            return false;
        } finally {

            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
