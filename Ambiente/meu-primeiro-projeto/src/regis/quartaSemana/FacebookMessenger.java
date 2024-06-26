package regis.quartaSemana;

public class FacebookMessenger extends Chat{

    @Override
    public void EnviarMensagem(){
        ValidarConectadoInternet();
        System.out.println("Mensagem enviado do Facebook");
        SalvarHistóricoDeMensagem();
    }

    @Override
    public void ReceberMensagem(){
        System.out.println("Mensagem recebido no Facebook");
    }
    
}
