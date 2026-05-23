/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lancadornotas.model;
import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private int id;
    private String nome;
    private String turma;
    private LocalDate dataNasc; // Como tipo de variável na DataNasc, nós importamos o LocalDate.

    public Aluno() {
    }

    public Aluno(String nome, String turma, LocalDate dataNasc) { // O contrutor e os getters e setters devem serem feitos sem a variável "id".
        this.nome = nome;
        this.turma = turma;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Aluno: " + "nome = " + nome + "\n" + " turma = " + turma +  "\n" + " dataNasc = " + dataNasc + '}';
    }
}
