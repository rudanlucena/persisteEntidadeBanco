package br.com.dac.entidades;

import java.io.Serializable;
public class Clube implements Serializable{
    private String nome;
    private String cidade;
    private String estadio;
    private int divisao;

    public Clube(String nome, String cidade, String estadio, int divisao) {
        this.nome = nome;
        this.cidade = cidade;
        this.estadio = estadio;
        this.divisao = divisao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getDivisao() {
        return divisao;
    }

    public void setDivisao(int divisao) {
        this.divisao = divisao;
    }
 
}
