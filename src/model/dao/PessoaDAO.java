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
public class PessoaDAO {

    private Connection con = null;

    public PessoaDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa (cpf, nome, email, perfil, senha) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, pessoa.getCpf());
            stmt.setString(2, pessoa.getNome());
            stmt.setString(3, pessoa.getEmail());
            stmt.setInt(4, pessoa.getPerfil());
            stmt.setString(5, pessoa.getSenha());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public Pessoa selecionar(String campo1) {
        Pessoa pessoa = new Pessoa();
        String sql = "SELECT * FROM pessoas "
                + "WHERE cpf = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, campo1);
            rs = stmt.executeQuery();
            while (rs.next()) {
                pessoa.setCpf(rs.getString("cpf"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setPerfil(rs.getInt("perfil"));
                pessoa.setSenha(rs.getString("senha"));              
            }
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return pessoa;
    }

    public boolean alterar(Professor professor) {
        String sql = "UPDATE pessoas "
                + "SET pessoas.nome = ?, pessoas.email = ? "
                + "WHERE pessoas.cpf = ?";
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getEmail());
            stmt.setString(3, professor.getCpf());
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public boolean deletar(String delCPF) {

        PessoaDAO dao = new PessoaDAO();

        String sql = "DELETE FROM pessoas "
                + "WHERE cpf = " + delCPF;
        
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
