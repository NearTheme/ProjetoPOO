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
import model.bean.Disciplina;
import model.bean.Curso;

/**
 *
 * @author Luiz Oliveira
 */
public class DisciplinaDAO {

    private Connection con = null;

    public DisciplinaDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(Disciplina disciplina) {
        String sql = "INSERT INTO disciplinas (codigo, nome, semestre, datainicio, datafim, codigocurso) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, disciplina.getCodigo());
            stmt.setString(2, disciplina.getNome());
            stmt.setInt(3, disciplina.getSemestre());
            stmt.setString(4, disciplina.getDatainicio());
            stmt.setString(5, disciplina.getDatafim());
            stmt.setInt(6, disciplina.getCodigocurso());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public Disciplina selecionar(int campo1) {
        Disciplina disciplina = new Disciplina();
        String sql = "SELECT * FROM disciplinas "
                + "WHERE codigo = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, campo1);
            rs = stmt.executeQuery();
            while (rs.next()) {
                disciplina.setCodigo(rs.getInt("codigo"));
                disciplina.setNome(rs.getString("nome"));
                disciplina.setSemestre(rs.getInt("semestre"));
                disciplina.setDatainicio(rs.getString("datainicio"));
                disciplina.setDatafim(rs.getString("datafim"));
                disciplina.setCodigocurso(rs.getInt("codigocurso"));
            }

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return disciplina;
    }

    public boolean alterar(Disciplina disciplina, int OldCodigo) {
        DisciplinaDAO dao = new DisciplinaDAO();
        String sql = "UPDATE disciplinas "
                + "SET codigo = ?, nome = ?, semestre = ?, datainicio = ?, datafim = ?, curso = ?"
                + "WHERE codigo = " + OldCodigo;
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, disciplina.getCodigo());
            stmt.setString(2, disciplina.getNome());
            stmt.setInt(3, disciplina.getSemestre());
            stmt.setString(4, disciplina.getDatainicio());
            stmt.setString(5, disciplina.getDatafim());
            stmt.setInt(6, disciplina.getCodigocurso());
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

        DisciplinaDAO dao = new DisciplinaDAO();

        String sql = "DELETE FROM disciplinas "
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
