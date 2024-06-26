package regis.terceiraSemana;

public class Carro extends Veiculo{

    @Override
    public void Ligar(){
        ConferirCombustível();
        ConferirCâmbio();
        System.out.println("CARRO LIGADO");
    }

    private void ConferirCombustível(){
        System.out.println("CONFERINDO COMBUSTÍVEL");
    }
    
    private void ConferirCâmbio(){
        System.out.println("CONFERINDO CâMBIO EM P");
    }
}
