package domain;

import java.util.Date;

public class Audiencia {
    private Date data;
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    private String recomendação;

    public String getRecomendação() {
        return recomendação;
    }

    public void setRecomendação(String recomendação) {
        this.recomendação = recomendação;
    }

    public Audiencia(Date data, String recomendação) {
        this.data = data;
        this.recomendação = recomendação;
    }
    @Override
    public String toString() {
        return "Audiencia [data=" + data + ", recomendação=" + recomendação + "]";
    }
    

}

