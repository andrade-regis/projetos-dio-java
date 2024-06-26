package regis.quartaSemana;

import java.util.Scanner;

public class Computador {
    public static void main(String[] args){

        Chat Chat = null;

        Scanner scan = new Scanner(System.in);

        String appEscolhido = scan.nextLine();

        scan.close();

        switch(appEscolhido){
            case "msn":
            {
                Chat = new MSNMessenger();
                Chat.EnviarMensagem();
                Chat.ReceberMensagem();
            }
            break;
            case "fbm":
            {
                Chat = new FacebookMessenger();
                Chat.EnviarMensagem();
                Chat.ReceberMensagem();
            }
            break;
            case "tlg":
            {
                Chat = new Telegram();
                Chat.EnviarMensagem();
                Chat.ReceberMensagem();
            }
            break;
            default:
            {
                System.out.println("App informado desconhecido...");
            }
            break;
        }
                
    }


}
