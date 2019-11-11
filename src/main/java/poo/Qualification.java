/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.List;

/**
 *
 * @author paulo.flausino
 */
public class Qualification {
    private int Id;
    private String QualificationName;

    public Qualification() {
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
     * @return the QualificationName
     */
    public String getQualificationName() {
        return QualificationName;
    }

    /**
     * @param QualificationName the QualificationName to set
     */
    public void setQualificationName(String QualificationName) {
        this.QualificationName = QualificationName;
    }

    @Override
    public String toString() {
        return getQualificationName();
    }
    
    public String getQualificationsString(List<Qualification> qualification) {
        String qualificationString = "";
        for (Qualification q: qualification) {
            if (qualificationString == "") {
                qualificationString = q.toString();
            }else{
                qualificationString = qualificationString + "," + q.toString();
            }
        }
        return qualificationString;
    }
    
    
}
