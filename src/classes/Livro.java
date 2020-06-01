/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author gabrielaambos
 */
public class Livro {
    private String titulo;
    private int ano;
    private String editora;
    private String autor;
    private boolean tem;
    private String edicao;
    private String serie;

    public Livro(String titulo, int ano, String editora, String autor, boolean tem, String edicao, String serie) {
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        this.autor = autor;
        this.tem = tem;
        this.edicao = edicao;
        if(serie == null) {
            this.serie = titulo;
        } else {
            this.serie = serie;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getEditora() {
        return editora;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isTem() {
        return tem;
    }

    public String getEdicao() {
        return edicao;
    }

    public String getSerie() {
        return serie;
    }
    
}
