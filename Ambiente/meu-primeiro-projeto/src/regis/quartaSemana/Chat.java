package regis.quartaSemana;

public abstract class Chat {
    
    public abstract void EnviarMensagem();

    public abstract void ReceberMensagem();

    protected void ValidarConectadoInternet(){
        System.out.println("Validando se está conectado na internet");
    }

    protected void SalvarHistóricoDeMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}
