package domain;
    import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Processo {
    private String numero;
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    private Tribunal tribunal;
    public Tribunal getTribunal() {
        return tribunal;
    }

    public void setTribunal(Tribunal tribunal) {
        this.tribunal = tribunal;
    }

    private Vara vara;
    public Vara getVara() {
        return vara;
    }

    public void setVara(Vara vara) {
        this.vara = vara;
    }

    private Date dataAbertura;
    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    private Date ddataC;
    public Date getDdataC() {
        return ddataC;
    }

    public void setDdataC(Date ddataC) {
        this.ddataC = ddataC;
    }

    private Pessoa cliente;
    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    private Pessoa parteContraria;

    public Pessoa getParteContraria() {
        return parteContraria;
    }

    public void setParteContraria(Pessoa parteContraria) {
        this.parteContraria = parteContraria;
    }
        private List<Audiencia> audiencia = new ArrayList<>();

    public List<Audiencia> getAudiencia() {
            return audiencia;
        }

        public void setAudiencia(List<Audiencia> audiencia) {
            this.audiencia = audiencia;
        }


    public Processo(String numero, Tribunal tribunal, Vara vara, Date dataAbertura, Date ddataC, Pessoa cliente, Pessoa parteContraria) {
        this.numero = numero;
        this.tribunal = tribunal;
        this.vara = vara;
        this.dataAbertura = dataAbertura;
        this.ddataC = ddataC;
        this.cliente = cliente;
        this.parteContraria = parteContraria;
    }
    @Override
    public String toString() {
        return "Processo [numero=" + numero + ", tribunal=" + tribunal + ", vara=" + vara + ", dataAbertura=" + dataAbertura
                + ", ddataC=" + ddataC + ", cliente=" + cliente + ", parteContraria="
                + parteContraria + "]";
    }
    
}


