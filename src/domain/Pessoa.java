package domain;


public class Pessoa {
    private int cod_pessoa;
    private String nome;
    private String email;

    public Pessoa(int cod_pessoa, String nome, String email) {
        this.cod_pessoa = cod_pessoa;
        this.nome = nome;
        this.email = email;
    }

    public int getCod_pessoa() {
        return cod_pessoa;
    }

    public void setCod_pessoa(int cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa [cod_pessoa=" + cod_pessoa + ", nome=" + nome + ", email=" + email + "]";
    }
}
