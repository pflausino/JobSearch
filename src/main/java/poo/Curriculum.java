/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulo.flausino
 */
public class Curriculum {
    private int Id;
    private String FullName;
    private String Email;
    private String Celular;
    private String Nacionalidade;
    private String Presentation;
    private int Idade;
    private String Objetivo;
    private ArrayList<Qualification> Qualifications;

    public Curriculum() {
        Qualifications = new ArrayList<Qualification>();
    }
    
    /**
     * @return the FullName
     */
    public String getFullName() {
        return FullName;
    }

    /**
     * @param FullName the FullName to set
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }



    /**
     * @return the Qualifications
     */
    public ArrayList<Qualification> getQualifications() {
        return Qualifications;
    }

    /**
     * @param Qualifications the Qualifications to set
     */
    public void setQualifications(ArrayList<Qualification> Qualifications) {
        this.Qualifications = Qualifications;
    }
    
    public void setQualifications(Qualification qualification) {
        this.getQualifications().add(qualification);
    }

    /**
     * @return the Presentation
     */
    public String getPresentation() {
        return Presentation;
    }

    /**
     * @param Presentation the Presentation to set
     */
    public void setPresentation(String Presentation) {
        this.Presentation = Presentation;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the Nacionalidade
     */
    public String getNacionalidade() {
        return Nacionalidade;
    }

    /**
     * @param Nacionalidade the Nacionalidade to set
     */
    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    /**
     * @return the Idade
     */
    public int getIdade() {
        return Idade;
    }

    /**
     * @param Idade the Idade to set
     */
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    /**
     * @return the Objetivo
     */
    public String getObjetivo() {
        return Objetivo;
    }

    /**
     * @param Objetivo the Objetivo to set
     */
    public void setObjetivo(String Objetivo) {
        this.Objetivo = Objetivo;
    }
    
    
}
