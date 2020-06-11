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
    private static Connection conexao;
    private static PreparedStatement sql;
    
    public static boolean adicionar(Livro livro) {
       boolean retorno;
       try{
           String query = "Insert into livros(titulo,ano,editora,autor,tem,edicao,serie) VALUES ('" + livro.getTitulo() + "', '" + livro.getAno() + "', '" + livro.getEditora() + "', '" + livro.getAutor() + "','" + livro.getTem() + "', '" + livro.getEdicao()+ "', '" + livro.getSerie() + "')";
           conexao = DBConnection.openConnection();
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
           conexao = DBConnection.openConnection();
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
    
    public static Livro pesquisarLivro(String pesquisa){
        Livro livro = null;
        try{
           String query = "SELECT * FROM livros WHERE UPPER(titulo) LIKE UPPER('" + pesquisa + "%')";
           conexao = DBConnection.openConnection();
           sql = conexao.prepareStatement(query);
           ResultSet rs = sql.executeQuery();
           while(rs.next()) {
              livro = new Livro(
                      rs.getInt("id"),
                      rs.getString("titulo"),
                      rs.getInt("ano"),
                      rs.getString("editora"),
                      rs.getString("autor"),
                      rs.getInt("tem"),
                      rs.getString("edicao"),
                      rs.getString("serie")
              );
           }
        } catch (Exception e) {
            
        } finally {
            DBConnection.closeConnection(conexao);
        }
        return livro;
    }
    
    public static ArrayList<Livro> pesquisarLivrosComprados(String pesquisa){
        ArrayList<Livro> livros = new ArrayList<Livro>();
        try{
           String query = "SELECT * FROM livros WHERE ( "
                   + "UPPER(titulo) LIKE UPPER('%" + pesquisa + "%') OR "
                   + "UPPER(autor) LIKE UPPER('%" + pesquisa + "%') OR "
                   + "UPPER(editora) LIKE UPPER('%" + pesquisa + "%') OR "
                   + "UPPER(serie) LIKE UPPER('%" + pesquisa + "%')) AND tem = '1'";
           conexao = DBConnection.openConnection();
           sql = conexao.prepareStatement(query);
           ResultSet rs = sql.executeQuery();
           while(rs.next()) {
              Livro livro = new Livro(
                      rs.getInt("id"),
                      rs.getString("titulo"),
                      rs.getInt("ano"),
                      rs.getString("editora"),
                      rs.getString("autor"),
                      rs.getInt("tem"),
                      rs.getString("edicao"),
                      rs.getString("serie")
              );
              livros.add(livro);
           }
        } catch (Exception e) {
            
        } finally {
            DBConnection.closeConnection(conexao);
        }
        return livros;
    }
    
        public static ArrayList<Livro> pesquisarLivrosDesejados(String pesquisa){
        ArrayList<Livro> livros = new ArrayList<Livro>();
        try{
           String query = "SELECT * FROM livros WHERE ( "
                   + "UPPER(titulo) LIKE UPPER('%" + pesquisa + "%') OR "
                   + "UPPER(autor) LIKE UPPER('%" + pesquisa + "%') OR "
                   + "UPPER(editora) LIKE UPPER('%" + pesquisa + "%') OR "
                   + "UPPER(serie) LIKE UPPER('%" + pesquisa + "%')) AND tem = '0'";
           conexao = DBConnection.openConnection();
           sql = conexao.prepareStatement(query);
           ResultSet rs = sql.executeQuery();
           while(rs.next()) {
              Livro livro = new Livro(
                      rs.getInt("id"),
                      rs.getString("titulo"),
                      rs.getInt("ano"),
                      rs.getString("editora"),
                      rs.getString("autor"),
                      rs.getInt("tem"),
                      rs.getString("edicao"),
                      rs.getString("serie")
              );
              livros.add(livro);
           }
        } catch (Exception e) {
            
        } finally {
            DBConnection.closeConnection(conexao);
        }
        return livros;
    }
    
    public static boolean deletarLivro(Livro livro) {
       boolean retorno;
       try{
           String query = "Delete from livros where id = '" + livro.getId() + "' ";
           conexao = DBConnection.openConnection();
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
    
    public static boolean atualizar(Livro livro) {
       boolean retorno;
       try{
           String query = "UPDATE livros SET "
                            + "titulo = '" + livro.getTitulo() + "', "
                            + "ano = '" + livro.getAno() + "', "
                            + "editora = '" + livro.getEditora() + "', "
                            + "autor = '" + livro.getAutor() + "', "
                            + "tem = '" + livro.getTem() + "', "
                            + "edicao = '" + livro.getEdicao() + "', "
                            + "serie = '" + livro.getSerie() + "' "
                     + "WHERE id = '" + livro.getId() + "'";
           conexao = DBConnection.openConnection();
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
    
    
}
