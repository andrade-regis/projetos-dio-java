package regis.terceiraSemana;

public class Moto extends Veiculo{

    @Override
    public void Ligar(){
        ConferirCâmbio();
        ConferirCombustível();
        System.out.println("MOTO LIGADA");
    }
    
    private void ConferirCombustível(){
        System.out.println("CONFERINDO COMBUSTÍVEL");
    }
    
    private void ConferirCâmbio(){
        System.out.println("CONFERINDO PEDAL EM N");
    }

}
