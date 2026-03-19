package com.evelynlevindo.gamestore.Model;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Game implements Serializable{
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id; // id gerado automaticamente pelo banco
    String nome;
    String descricao;
    String desenvolvimento;
    double preco;

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDesenvolvimento() {
        return desenvolvimento;
    }
    public void setDesenvolvimento(String desenvolvimento) {
        this.desenvolvimento = desenvolvimento;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
