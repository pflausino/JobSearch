/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.component;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import poo.Vaga;

/**
 *
 * @author paulo.flausino
 */
public class VagasTableModel extends AbstractTableModel{
    private String colunas[] = {"Titulo", "Descrição"};
    private List<Vaga> dados;
    
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
        Vaga vaga = dados.get(l);
        switch(c){
            case 0:
                return vaga.getTitulo();
            case 1:
                return vaga.getDescricao();
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
    
    public void setDados(List<Vaga> dados){
        this.dados = dados;
        fireTableDataChanged();
    }
    
    public Vaga getRowValue(int l){
        return dados.get(l);
    }
}
