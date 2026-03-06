import interfaces.Comunicador;

public class ServicoSMS implements Comunicador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS via Gateway: " + mensagem);
    }
}
