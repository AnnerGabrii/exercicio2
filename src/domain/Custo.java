package domain;
import java.util.Date;

public class Custo {
    private Date data;
    private double valor;
    private String descrição;

    public Custo(Date data, double valor, String descrição) {
        this.data = data;
        this.valor = valor;
        this.descrição = descrição;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Override
    public String toString() {
        return "Custo [data=" + data + ", valor=" + valor + ", descrição=" + descrição + "]";
    }
}
