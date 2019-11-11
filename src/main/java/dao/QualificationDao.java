/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import poo.Qualification;

/**
 *
 * @author paulo.flausino
 */
public class QualificationDao implements IDAO<Qualification>{

    @Override
    public void insert(Qualification qualification) throws Exception{

        Conection c = new Conection();

        String sql="INSERT INTO tbqualification (QualificationName) VALUES (?)";

        PreparedStatement ps = c.getConexao().prepareStatement(sql);

        ps.setString(1, qualification.getQualificationName());
        
        ps.execute();
        c.confirmar();
    }
    
    @Override
    public void update(Qualification qualification) throws Exception{
        Conection c = new Conection();
        
        String sql="UPDATE tbqualification SET QualificationName=? WHERE Id=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, qualification.getQualificationName());
        ps.setInt(2, qualification.getId());
        
        ps.execute();
        c.confirmar();
    }
    
 
    
    
    @Override
    public void delete(Qualification qualification) throws Exception{
        Conection c = new Conection();
        
        String sql = "DELETE FROM tbqualification WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, qualification.getId());
        
        ps.execute();
        c.confirmar();
    }
    
    @Override
    public ArrayList<Qualification> listAll() throws Exception{
        Conection c = new Conection();
        
        String sql = "SELECT * FROM tbqualification ORDER BY QualificationName";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        ArrayList listarQualification = new ArrayList();
        while(rs.next()){
            Qualification qualification = new Qualification();
            qualification.setId(rs.getInt("Id"));
            qualification.setQualificationName(rs.getString("QualificationName"));
            listarQualification.add(qualification);
        }
        return listarQualification;
    }
    
    @Override
    public Qualification getById(int id) throws Exception{
        Conection c = new Conection();
        
        String sql = "SELECT * FROM tbqualification WHERE Id=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
       
        Qualification cliente = new Qualification();
        if(rs.next()){
            cliente.setId(rs.getInt("Id"));
            cliente.setQualificationName(rs.getString("QualificationName"));
        }
        return cliente;
    }
    
    public Qualification findByName(String name) throws Exception{
        Conection c = new Conection();
        
        String sql = "SELECT * FROM tbqualification WHERE Name=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
       
        Qualification qualification = new Qualification();
        if(rs.next()){
            qualification.setId(rs.getInt("Id"));
            qualification.setQualificationName(rs.getString("QualificationName"));
        }
        return qualification;
    }
    
}
