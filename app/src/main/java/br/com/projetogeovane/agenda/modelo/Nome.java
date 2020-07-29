package br.com.projetogeovane.agenda.modelo;

public class Nome {
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Double nota;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getnome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getendereco() {
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

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public Double getnota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public void setNota(String toString) {
    }
}