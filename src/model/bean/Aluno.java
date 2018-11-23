/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Luiz Oliveira
 */
public class Aluno {
    private String nome;
    private String cpf;
    private String senha;
    private int perfil;    
    private String email;
    private String ra;
    private String horario;
    private int semestre;
    private String curso;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String senha, int perfil, String email, String ra, String horario, int semestre, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.perfil = perfil;
        this.email = email;
        this.ra = ra;
        this.horario = horario;
        this.semestre = semestre;
        this.curso = curso;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
