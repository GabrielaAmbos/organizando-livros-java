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
    private int id;
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
    
    public Livro(int id, String titulo, int ano, String editora, String autor, int tem, String edicao, String serie) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        this.autor = autor;
        if(tem == 1) {
            this.tem = true;
        } else {
            this.tem = false;
        }
        //this.tem = tem == 1;
        this.edicao = edicao;
        if(serie == null) {
            this.serie = titulo;
        } else {
            this.serie = serie;
        }
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
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
    
    public int getTem() {
        if(tem) {
            return 1;
        } else {
            return 0;
        }
    }
    
}
