package regis.primeiraSemana;

public class Boletim {
    public static void main(String[] args){
        // System.out.println(Resultado(4));
        // RetornoOperadores(15, 47);
        RetornoTernário();
    }



    private static void RetornoTernário(){
        
        boolean SouAdulto = false;

        String texto = SouAdulto == false ? "NÃO" : "SIM";

        System.out.println("Eu sou adulto?");
        System.out.println(texto);
    }

    private static void RetornoOperadores(int valor01, int valor02){
        int resultado = 0;

        resultado = valor01 + valor02;
        System.out.println("Resultado Soma: " + resultado);

        resultado = valor01 - valor02;
        System.out.println("Resultado Subtração: " + resultado);

        resultado = valor01 * valor02;
        System.out.println("Resultado Multiplicação: " + resultado);
        
        resultado = valor01 / valor02;
        System.out.println("Resultado Divisão: " + resultado);
        
        resultado = valor01 % valor02;
        System.out.println("Sobra Divisão(Módulo): " + resultado);
        
        for(int contador = 0; contador < 6; contador++){
            resultado++;
            System.out.println("Resultador For(+1): " + resultado);
        }
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
