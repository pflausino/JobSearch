/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author paulo.flausino
 */
public class Conection {
    
        //Variaveis com dados para conexao com o banco MySQL
    private final String SERVIDOR = "localhost";

    private final String PORTA = "3306";

    private final String BANCO_DE_DADOS = "dbbuscaemprego";

    private final String USUARIO = "root";

    private final String SENHA = "";

    //jdbc: Driver do windows para conexão com MySQL
    private final String URL = "jdbc:mysql://" + SERVIDOR + ":" + PORTA + "/" + BANCO_DE_DADOS;


    //Instancia da classe conexao
    private Connection conexao;


    
    public Conection() throws ClassNotFoundException, SQLException {

        try {
            //nova instancia do driver jdbc
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            //iniciando o driver passando os parametros de URL, USUARIo e SENHA
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

            //Desabilitando o auto envio de informação para banco
            conexao.setAutoCommit(false);

            //Erro de driver
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {

            throw new ClassNotFoundException("O driver de conexão não foi adicionado ao projeto.\n" + e.getMessage());

            //Erro de MySQL - Por exemplo, erro na query
        } catch (SQLException e) {

            throw new SQLException("Problemas nos parâmetros de conexão.\n" + e.getMessage());

        }

    }


    //retorna estado atual da conexao
    public Connection getConexao() {

        return conexao;

    }


    //Confirmar o envio envio de informação para o banco
    public void confirmar() throws SQLException {

        try {

            conexao.commit();
            //Erro de sintax SQL 
        } catch (SQLException e) {

            throw new SQLException("Problemas na instrução SQL.\n" + e.getMessage());
            //Encerrar a conexao
        } finally {

            conexao.close();

        }

    }
}
