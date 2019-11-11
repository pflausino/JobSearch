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
import poo.Curriculum;
import poo.Qualification;

/**
 *
 * @author paulo.flausino
 */
public class CurriculumDao implements IDAO<Curriculum>{

    @Override
    public void insert(Curriculum curriculum) throws Exception{

        Conection c = new Conection();
        Qualification qualification = new Qualification();

        String sql="INSERT INTO tbcurriculum "
                    + "("
                        + "FullName,"
                        + "Email,"
                        + "Celular,"
                        + "Nacionalidade,"
                        + "Presentation,"
                        + "Idade,"
                        + "Objetivo,"
                        + "Qualifications"
                    + ") VALUES (?,?,?,?,?,?,?,?)";

        PreparedStatement ps = c.getConexao().prepareStatement(sql);

        ps.setString(1, curriculum.getFullName());
        ps.setString(2, curriculum.getEmail());
        ps.setString(3, curriculum.getCelular());
        ps.setString(4, curriculum.getNacionalidade());
        ps.setString(5, curriculum.getPresentation());
        ps.setString(6, String.valueOf(curriculum.getIdade()));
        ps.setString(7, curriculum.getObjetivo());
        ps.setString(8, qualification.getQualificationsString(
                curriculum.getQualifications()));
        
        
        ps.execute();
        c.confirmar();
    }
    
    @Override   
    public void update(Curriculum curriculum) throws Exception{
        Conection c = new Conection();
        Qualification qualification = new Qualification();
        
        String sql="UPDATE tbcurriculum SET "
                + "FullName=?,"
                + "Email=?,"
                + "Celular =?,"
                + "Nacionalidade =?,"
                + "Presentation =?,"
                + "Idade =?,"
                + "Objetivo =?,"
                + "Qualifications =?"
            + "WHERE Id=?";
        
        
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, curriculum.getFullName());
        ps.setString(2, curriculum.getEmail());
        ps.setString(3, curriculum.getCelular());
        ps.setString(4, curriculum.getNacionalidade());
        ps.setString(5, curriculum.getPresentation());
        ps.setString(6, String.valueOf(curriculum.getIdade()));
        ps.setString(7, curriculum.getObjetivo());
        ps.setString(8, qualification.getQualificationsString(
                curriculum.getQualifications()));
        ps.setInt(9, curriculum.getId());
        
        ps.execute();
        c.confirmar();
    }
    
 
    
    
    @Override
    public void delete(Curriculum curriculum) throws Exception{
        Conection c = new Conection();
        
        String sql = "DELETE FROM tbcurriculum WHERE Id=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, curriculum.getId());
        
        ps.execute();
        c.confirmar();
    }
    
    @Override
    public ArrayList<Curriculum> listAll() throws Exception{
        Conection c = new Conection();
        
        String sql = "SELECT * FROM tbcurriculum ORDER BY Id";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        ArrayList listarCurriculum = new ArrayList();
        while(rs.next()){
            Curriculum curriculum = new Curriculum();
            
            curriculum.setId(rs.getInt("Id"));
            curriculum.setFullName(rs.getString("FullName"));
            curriculum.setEmail(rs.getString("Email"));
            curriculum.setCelular(rs.getString("Celular"));
            curriculum.setNacionalidade(rs.getString("Nacionalidade"));
            curriculum.setPresentation(rs.getString("Presentation"));
            curriculum.setIdade(Integer.parseInt(rs.getString("Idade")));
            curriculum.setObjetivo(rs.getString("Objetivo"));
            //curriculum.setQualifications(QualificationDao.findByName(rs.getString("Qualification")));
            
            listarCurriculum.add(curriculum);
        }
        return listarCurriculum;
    }
    

    public ArrayList<Curriculum> GetByEmail(String email) throws Exception{
        Conection c = new Conection();
        
        String sql = 
                "SELECT * FROM tbcurriculum "
                + "Where Email= ?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        
        ArrayList listarCurriculum = new ArrayList();
        while(rs.next()){
            Curriculum curriculum = new Curriculum();
            
            curriculum.setId(rs.getInt("Id"));
            curriculum.setFullName(rs.getString("FullName"));
            curriculum.setEmail(rs.getString("Email"));
            curriculum.setCelular(rs.getString("Celular"));
            curriculum.setNacionalidade(rs.getString("Nacionalidade"));
            curriculum.setPresentation(rs.getString("Presentation"));
            curriculum.setIdade(Integer.parseInt(rs.getString("Idade")));
            curriculum.setObjetivo(rs.getString("Objetivo"));
            
            String qualificationString = rs.getString("Qualifications");
            List<String> qualificationItems = Arrays.asList(qualificationString.split("\\s*,\\s*"));

            for (String q : qualificationItems) {
                Qualification qualy = new Qualification();
                qualy.setQualificationName(q);
                curriculum.setQualifications(qualy);
            }
            
            listarCurriculum.add(curriculum);
        }
        return listarCurriculum;
    }
    @Override
    public Curriculum getById(int id) throws Exception{
        Conection c = new Conection();
        
        String sql = "SELECT * FROM tbcurriculum WHERE Id=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
       
        Curriculum curriculum = new Curriculum();
        if(rs.next()){
            curriculum.setId(rs.getInt("Id"));
            curriculum.setFullName(rs.getString("FullName"));
            curriculum.setEmail(rs.getString("Email"));
            curriculum.setCelular(rs.getString("Celular"));
            curriculum.setNacionalidade(rs.getString("Nacionalidade"));
            curriculum.setPresentation(rs.getString("Presentation"));
            curriculum.setIdade(Integer.parseInt(rs.getString("Idade")));
            curriculum.setObjetivo(rs.getString("Objetivo"));
            //curriculum.setQualifications(QualificationDao.findByName(rs.getString("Qualification")));
        }
        return curriculum;
    }
    
}
