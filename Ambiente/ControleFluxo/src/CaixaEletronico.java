public class CaixaEletronico {
    public static void main(String[] args) {
    
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado == 0){
            System.out.println("Operação não realizada, não foi informado valor para saque.");
        }
        else if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        }
        else{
            System.out.println("Operação não realizada, devido ao valor solicitado ser superior ao Saldo: " + saldo);
        }
    }
}
