/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author paulo.flausino
 * @param <T>
 */
public interface IDAO<T> {
        
    public void insert(T objeto) throws Exception;
    
    public void update(T objeto) throws Exception;
    
    public void delete(T objeto) throws Exception;
    
    public ArrayList<T> listAll() throws Exception;
    
    public T getById(int codigo) throws Exception;
}
