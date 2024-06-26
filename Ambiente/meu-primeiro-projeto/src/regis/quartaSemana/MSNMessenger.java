package regis.quartaSemana;

public class MSNMessenger extends Chat{   

    @Override
    public void EnviarMensagem(){
        ValidarConectadoInternet();
        System.out.println("Mensagem enviado do MSN");
        SalvarHistóricoDeMensagem();
    }

    @Override
    public void ReceberMensagem(){
        System.out.println("Mensagem recebido no MSN");
    }

}
