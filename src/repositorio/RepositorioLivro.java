/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import classes.DBConnection;
import classes.Livro;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gabrielaambos
 */
public  class RepositorioLivro {
    private static ArrayList<Livro> livros = new ArrayList<Livro>();
    private static Connection conexao = DBConnection.openConnection();
    private static PreparedStatement sql;
    
    public static boolean adicionar(Livro livro) {
       boolean retorno;
       try{
           String query = "Insert into livros(titulo,ano,editora,autor,tem,edicao,serie) VALUES ('" + livro.getTitulo() + "', '" + livro.getAno() + "', '" + livro.getEditora() + "', '" + livro.getAutor() + "','" + livro.isTem() + "', '" + livro.getEdicao()+ "', '" + livro.getSerie() + "')";
           sql = conexao.prepareStatement(query);
           sql.executeUpdate();
           retorno = true;
       } catch (Exception e) {
           retorno = false;
       } finally {
           DBConnection.closeConnection(conexao);
       }
       return retorno;
    }
    
    public static ArrayList<Livro> listrar() {
        return livros;
    }
    
    public static String listaDeExemplares() {
        String exemplares = "";
        for(String titulo : selectTitulos()) {
            exemplares += titulo + "\n";
        }
        return exemplares;
    }
    
    private static ArrayList<String> selectTitulos() {
        ArrayList<String> titulos = new ArrayList<String>();
        try{
           String query = "Select titulo from livros";
           sql = conexao.prepareStatement(query);
           ResultSet rs = sql.executeQuery();
           while(rs.next()) {
               String titulo = rs.getString("titulo");
               titulos.add(titulo);
           }
        } catch (Exception e) {
            
        } finally {
            DBConnection.closeConnection(conexao);
        }
        return titulos;
    }
}
