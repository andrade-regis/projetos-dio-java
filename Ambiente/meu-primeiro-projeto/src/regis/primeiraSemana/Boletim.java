package regis.primeiraSemana;

public class Boletim {
    public static void main(String[] args){
        System.out.println(Resultado(4));
    }

    private static String Resultado(int MédiaFinal){
        String mensagem = "";
        
        if(MédiaFinal < 6){
            mensagem = "REPROVADO";
        }
        else if(MédiaFinal == 6){
            mensagem = "RASPANDO";
        }
        else{
            mensagem = "APROVADO";
        }

        return mensagem;
    }
    
}
