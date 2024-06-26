package regis.terceiraSemana;

public class Autodromo {

    public static void main(String[] args){
        Carro jeep = new Carro();
        jeep.setChassi("855462");
        jeep.Ligar();

        Moto z400 = new Moto();
        z400.setChassi("1233423");
        z400.Ligar();
        
        Veiculo Coringa = z400;
        Coringa.Ligar();
    }
}
