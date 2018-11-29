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
public class Disciplina
{
    private int codigo;
    private String nome;
    private int semestre;
    private String datainicio;
    private String datafim;
    private Curso curso;

    
    public Disciplina()
    {
        this.codigo = 0;
        this.nome = "";
        this.semestre = 0;
        this.datainicio = "";
        this.datafim = "";
        this.curso = new Curso();
    }
    public Disciplina( int codigo, String nome, int semestre, String datainicio, String datafim, Curso curso )
    {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.curso = curso;
    }
    public Disciplina( Disciplina a )
    {
        this.codigo = a.codigo;
        this.nome = a.nome;
        this.semestre = a.semestre;
        this.datainicio = a.datainicio;
        this.datafim = a.datafim;
        this.curso = a.curso;
    }

    
    public int getCodigo()
    {
        return codigo;
    }
    public void setCodigo( int codigo )
    {
        this.codigo = codigo;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome( String nome )
    {
        this.nome = nome;
    }
    public int getSemestre()
    {
        return semestre;
    }
    public void setSemestre( int semestre )
    {
        this.semestre = semestre;
    }
    public String getDatainicio()
    {
        return datainicio;
    }
    public void setDatainicio( String datainicio )
    {
        this.datainicio = datainicio;
    }
    public String getDatafim()
    {
        return datafim;
    }
    public void setDatafim( String datafim )
    {
        this.datafim = datafim;
    }
    public Curso getCurso()
    {
        return curso;
    }
    public void setCurso( Curso curso )
    {
        this.curso = curso;
    }
    public int getCodigocurso()
    {
        return curso.getCodigo();
    }
    public void setCodigocurso( int codigo )
    {
        this.curso.setCodigo(codigo);
    }
}