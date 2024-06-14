package regis.Exemplo;

public class SmartTv {
    
    public boolean On = false;
    public int Canal = 5;
    public int Volume = 0;
        
    public void Ligar(){
        if(!On){
            On = true;
        }
    }

    public void Desligar(){
        if(On){
            On = false;
        }
    }

    public void AumentarVolume(){
        if(Volume < 100){
            Volume++;
        }
    }

    public void DiminuirVolume(){
        if(Volume > 0){
            Volume--;
        }
    }

    public void AumentarCanal(){
        if(Canal >= 45){
            Canal = 5;
        }
        else{
            Canal++;
        }
    }

    public void DiminuirCanal(){
        if(Canal <= 5){
            Canal = 45;
        }
        else{
            Canal--;
        }
    }
}
