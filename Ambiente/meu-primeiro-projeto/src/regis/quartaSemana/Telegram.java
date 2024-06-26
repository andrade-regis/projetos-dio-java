package regis.quartaSemana;

public class Telegram extends Chat{
    
    @Override
    public void EnviarMensagem(){
        ValidarConectadoInternet();
        System.out.println("Mensagem enviado do Telegram");
        SalvarHistóricoDeMensagem();
    }

    @Override
    public void ReceberMensagem(){
        System.out.println("Mensagem recebido no Telegram");
    }
}
