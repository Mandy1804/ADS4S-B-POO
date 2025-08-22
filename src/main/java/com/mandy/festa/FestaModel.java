package com.mandy.festa;

import jakarta.persistence.*;

@Table (name = "FESTA")
@Entity (name = "TBL_FESTA")



public class FestaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private int qtdpessoa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQtdpessoa() {
        return qtdpessoa;
    }

    public void setQtdpessoa(int qtdpessoa) {
        this.qtdpessoa = qtdpessoa;
    }
}
