package br.com.alura.agenda.modelo;

import android.support.annotation.NonNull;

import java.io.Serializable;

public class Aluno implements Serializable, Comparable<Aluno> {

    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String site;
    private Double nota;

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        if (id != null ? !id.equals(aluno.id) : aluno.id != null) return false;
        if (nome != null ? !nome.equals(aluno.nome) : aluno.nome != null) return false;
        if (endereco != null ? !endereco.equals(aluno.endereco) : aluno.endereco != null)
            return false;
        if (telefone != null ? !telefone.equals(aluno.telefone) : aluno.telefone != null)
            return false;
        if (site != null ? !site.equals(aluno.site) : aluno.site != null) return false;
        return nota != null ? nota.equals(aluno.nota) : aluno.nota == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        result = 31 * result + (site != null ? site.hashCode() : 0);
        result = 31 * result + (nota != null ? nota.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(@NonNull Aluno outroAluno) {
        return this.nome.compareTo(outroAluno.getNome());
    }
}
