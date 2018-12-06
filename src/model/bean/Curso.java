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

public class Curso
{
    private int codigo;
    private String nome;
    private String horario;
    private String datainicio;
    private String datafim;

    
    public Curso()
    {
        this.nome = "";
        this.horario = "";
        this.datainicio = "";
        this.datafim = "";

    }
    public Curso(String nome, String horario, String datainicio, String datafim )
    {
        this.nome = nome;
        this.horario = horario;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }
    public Curso( Curso a )
    {
        this.nome = a.nome;
        this.horario = a.horario;
        this.datainicio = a.datainicio;
        this.datafim = a.datafim;
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
    public String getHorario()
    {
        return horario;
    }
    public void setHorario( String horario )
    {
        this.horario = horario;
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
 
    
}