/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import poo.Vaga;
import poo.Qualification;

/**
 *
 * @author paulo.flausino
 */
public class VagaDao implements IDAO<Vaga>{

    @Override
    public void insert(Vaga vaga) throws Exception {
        Conection c = new Conection();
        Qualification qualification = new Qualification();

        String sql="INSERT INTO tbvaga "
                    + "("
                        + "Titulo,"
                        + "Descricao,"
                        + "QualificacoesExigidas"
                    + ") VALUES (?,?,?)";

        PreparedStatement ps = c.getConexao().prepareStatement(sql);

        ps.setString(1, vaga.getTitulo());
        ps.setString(2, vaga.getDescricao());
        ps.setString(3, qualification.getQualificationsString(
                vaga.getQualificacoesExigidas()));
        
        
        ps.execute();
        c.confirmar(); 
    }

    @Override
    public void update(Vaga vaga) throws Exception {
        Conection c = new Conection();
        Qualification qualification = new Qualification();
        
        String sql="UPDATE tbvaga SET "
                        + "Titulo=?,"
                        + "Descricao=?,"
                        + "QualificacoesExigidas=?"
                + "WHERE Id=?";
        
        
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, vaga.getTitulo());
        ps.setString(2, vaga.getDescricao());
        ps.setString(3, qualification.getQualificationsString(
                vaga.getQualificacoesExigidas()));
        ps.setInt(4, vaga.getId());
        
        ps.execute();
        c.confirmar();
    }

    @Override
    public void delete(Vaga vaga) throws Exception {
        Conection c = new Conection();
        
        String sql = "DELETE FROM tbvaga WHERE Id=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, vaga.getId());
        
        ps.execute();
        c.confirmar();
    }

    @Override
    public ArrayList<Vaga> listAll() throws Exception {
                Conection c = new Conection();
        
        String sql = "SELECT * FROM tbvaga ORDER BY Id";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        ArrayList listarVaga = new ArrayList();
        while(rs.next()){
            Vaga vaga = new Vaga();
            
            vaga.setId(rs.getInt("Id"));
            vaga.setTitulo(rs.getString("Titulo"));
            vaga.setDescricao(rs.getString("Descricao"));
            
            String qualificationString = rs.getString("QualificacoesExigidas");
            List<String> qualificationItems = Arrays.asList(qualificationString.split("\\s*,\\s*"));

            for (String q : qualificationItems) {
                Qualification qualy = new Qualification();
                qualy.setQualificationName(q);
                vaga.setQualifications(qualy);
            }
            
            listarVaga.add(vaga);
        }
        return listarVaga;
    }

    @Override
    public Vaga getById(int id) throws Exception {
        Conection c = new Conection();
        
        String sql = "SELECT * FROM tbvaga WHERE Id=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
       
        Vaga vaga = new Vaga();
        if(rs.next()){
            vaga.setId(rs.getInt("Id"));
            vaga.setTitulo(rs.getString("Titulo"));
            vaga.setDescricao(rs.getString("Descricao"));
            
            String qualificationString = rs.getString("QualificacoesExigidas");
            List<String> qualificationItems = Arrays.asList(qualificationString.split("\\s*,\\s*"));

            for (String q : qualificationItems) {
                Qualification qualy = new Qualification();
                qualy.setQualificationName(q);
                vaga.setQualifications(qualy);
            }
            

        }
        return vaga;
    }
    
}
