package domain;
public class Vara {
    private int numero;
    private String nome;
    private Tribunal tribunal;

    public Vara(int numero, String nome, Tribunal tribunal) {
        this.numero = numero;
        this.nome = nome;
        this.tribunal = tribunal;
    }

    public int getnumero() {
        return numero;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tribunal getTribunal() {
        return tribunal;
    }

    public void setTribunal(Tribunal tribunal) {
        this.tribunal = tribunal;
    }

    @Override
    public String toString() {
        return "Vara [numero=" + numero + ", nome=" + nome + ", tribunal=" + tribunal + "]";
    }
}
