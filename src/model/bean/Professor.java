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
public class Professor extends Pessoa
{
    private String rm;
    private String formacao;
    private String especializacao;
    private int horasdedicacao;
    //protected Disciplina disciplinas;

    
    public Professor()
    {
        this.rm = "";
        this.formacao = "";
        this.especializacao = "";
        this.horasdedicacao = 0;
    }
    public Professor( String rm, String formacao, String especializacao, int horasdedicacao )
    {
        this.rm = rm;
        this.formacao = formacao;
        this.especializacao = especializacao;
        this.horasdedicacao = horasdedicacao;
    }
    public Professor( Professor a )
    {
        this.rm = a.rm;
        this.formacao = a.formacao;
        this.especializacao = a.especializacao;
        this.horasdedicacao = a.horasdedicacao;
    }

    
    public String getRm()
    {
        return rm;
    }
    public void setRm( String matricula )
    {
        this.rm = matricula;
    }
    public String getFormacao()
    {
        return formacao;
    }
    public void setFormacao( String formacao )
    {
        this.formacao = formacao;
    }
    public String getEspecializacao()
    {
        return especializacao;
    }
    public void setEspecializacao( String especializacao )
    {
        this.especializacao = especializacao;
    }
    public int getHorasdedicacao()
    {
        return horasdedicacao;
    }
    public void setHorasdedicacao( int horasdedicacao )
    {
        this.horasdedicacao = horasdedicacao;
    }

    
}