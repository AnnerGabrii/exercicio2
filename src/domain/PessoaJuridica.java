package domain;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(int codigo, String nome, String email, String cnpj) {
        super(codigo, nome, email);
        this.cnpj = cnpj;
    }
    @Override
    public String toString() {
        return "PessoaJuridica [cnpj=" + cnpj + ", " + super.toString() + "]";
    }
    
}
