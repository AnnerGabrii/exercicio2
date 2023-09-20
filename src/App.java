
import java.util.Date;


import domain.Audiencia;
import domain.Custo;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Processo;
import domain.Tribunal;
import domain.Vara;

public class App {
    public static void main(String[] args) {


       
        PessoaFisica carlos = new PessoaFisica(1, "Carlos", "carloseduardodantas@iftm.edu.br", "000.000.000-00");
        PessoaJuridica starfield = new PessoaJuridica(2, "Starfield Linhas Espaciais", "starfield@gmail.com", "0001.0001.0001-00");

        
        Tribunal trf1 = new Tribunal(1, "TRF-1");

    
        Vara varaCivel = new Vara(1, "Vara Cível", trf1);


        Date dataAbertura = new Date();
        Processo processo = new Processo("00345676-79.2014.4.01.3103", trf1, varaCivel, dataAbertura, null, carlos, starfield);


        Date dataAudiencia = new Date();
        Audiencia audiencia = new Audiencia(dataAudiencia, "Recomendação da audiência");

        
        Date dataCusto = new Date();
        Custo custo = new Custo(dataCusto, 500.0, "Deslocamento para audiência");


        System.out.println("Pessoa: " + carlos);
        System.out.println("Pessoa: " + starfield);
        System.out.println("Tribunal: " + trf1);
        System.out.println("Vara: " + varaCivel);
        System.out.println("Processo: " + processo);
        System.out.println("Audiência: " + audiencia);
        System.out.println("Custo: " + custo);
    }
}
