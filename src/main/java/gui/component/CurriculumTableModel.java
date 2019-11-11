/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.component;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import poo.Curriculum;

/**
 *
 * @author paulo.flausino
 */
public class CurriculumTableModel extends AbstractTableModel {

    private String colunas[] = {"Nome", "Email", "Apresentação"};
    private List<Curriculum> dados;
    
    @Override
    public int getRowCount() {
       if(dados == null){
           return 0;
       }
       return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int l, int c) {
        Curriculum curriculum = dados.get(l);
        switch(c){
            case 0:
                return curriculum.getFullName();
            case 1:
                return curriculum.getEmail();
            case 2:
                return curriculum.getPresentation();
            default:
                throw new IndexOutOfBoundsException("Coluna inexistente");
        }
    }
    
    @Override
    public String getColumnName(int c){
        return colunas[c];
    }
    
    @Override
    public boolean isCellEditable(int l, int c){
        return false;
    }
    
    public void setDados(List<Curriculum> dados){
        this.dados = dados;
        fireTableDataChanged();
    }
    
    public Curriculum getRowValue(int l){
        return dados.get(l);
    }
}
