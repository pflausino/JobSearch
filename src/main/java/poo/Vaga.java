/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;

/**
 *
 * @author paulo.flausino
 */
public class Vaga {
    private int Id;
    private String Titulo;
    private String Descricao;
    private ArrayList<Qualification> QualificacoesExigidas; 

    public Vaga() {
        QualificacoesExigidas = new ArrayList<Qualification>();
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
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the QualificacoesExigidas
     */
    public ArrayList<Qualification> getQualificacoesExigidas() {
        return QualificacoesExigidas;
    }

     /**
     * @param Qualifications the Qualifications to set
     */
    public void setQualifications(ArrayList<Qualification> Qualifications) {
        this.QualificacoesExigidas = Qualifications;
    }
    
    public void setQualifications(Qualification qualification) {
        this.getQualificacoesExigidas().add(qualification);
    }
    /**
     * @param QualificacoesExigidas the QualificacoesExigidas to set
     */
    public void setQualificacoesExigidas(ArrayList<Qualification> QualificacoesExigidas) {
        this.QualificacoesExigidas = QualificacoesExigidas;
    }
}
