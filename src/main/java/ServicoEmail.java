import interfaces.Comunicador;

public class ServicoEmail implements Comunicador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando E-mail SMTP: " + mensagem);
    }
}

public class ServicoSMS implements Comunicador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS via Gateway: " + mensagem);
    }
}