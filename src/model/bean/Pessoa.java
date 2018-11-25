/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Eduardo Soares
 */
public class Pessoa
{
    private String cpf;
    private String nome;
    private String email;
    private int perfil;      // 1-Administrador,  2-Professor,  3-Aluno
    private String senha;
 
    
    public Pessoa()
    {
        this.cpf = "";
        this.nome = "";
        this.email = "";
        this.perfil = 0;
        this.senha = "";       
    }
    public Pessoa( String cpf, String nome, String email, int perfil, String senha )
    {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.perfil = perfil;
        this.senha = senha;
    }
    public Pessoa( Pessoa a )
    {
        this.cpf = a.cpf;
        this.nome = a.nome;
        this.email = a.email;
        this.perfil = a.perfil;
        this.senha = a.senha;        
    }

    
    public String getCpf()
    {
        return cpf;
    }
    public void setCpf( String cpf )
    {
        this.cpf = cpf;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome( String nome )
    {
        this.nome = nome;
    }
     public String getEmail()
    {
        return email;
    }
    public void setEmail( String email )
    {
        this.email = email;
    }
    public int getPerfil()
    {
        return perfil;
    }
    public void setPerfil( int perfil )
    {
        this.perfil = perfil;
    }
    public String getSenha()
    {
        return senha;
    }
    public void setSenha( String senha )
    {
        this.senha = senha;
    }
        
    
    public void imprimePessoa()
    {
	System.out.println( "Nome = " + nome );
    }    
    
    
}