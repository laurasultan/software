package model;

import java.util.Date;

public class Livraria {
    private long codLivro;
    private String nomeLivro;
    private String nomeAutor;
    private String status;

    public long getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(long codLivro) {
        this.codLivro = codLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void retiraLivro(Usuario pessoa, Date data) {
        // Implementação do método
    }

    @Override
    public String toString() {
        return "Livraria{" +
                "codLivro=" + codLivro +
                ", nomeLivro='" + nomeLivro + '\'' +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
