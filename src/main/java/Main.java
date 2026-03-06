import interfaces.Comunicador;
import interfaces.ServicoEmail;
import interfaces.ServicoSMS;

public class Main {
    public static void main(String[] args) {


        Comunicador email = new ServicoEmail();
        RecuperadorDeSenha recuperadorEmail = new RecuperadorDeSenha(email);
        recuperadorEmail.recuperar("usuario@tech.com");

        System.out.println("---");


        Comunicador sms = new ServicoSMS();
        RecuperadorDeSenha recuperadorSMS = new RecuperadorDeSenha(sms);
        recuperadorSMS.recuperar("99999-9999");
    }
}
