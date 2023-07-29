package model;

public class Usuario {
    private long codUsuario;
    private String nomeUsuario;
    private String emailUsuario;
    private String senha;
    private String categoria;

    public long getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(long codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void validaUsuario(long cod) {
        // public void ou public boolean
        // Implementação do método
    }

    public void codificaSenha(String senha) {
        // public void ou public String
        // Implementação do método
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codUsuario=" + codUsuario +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", emailUsuario='" + emailUsuario + '\'' +
                ", senha='" + senha + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
