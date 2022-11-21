package app;

public class Samsung implements Phone{
    private int volume;
    private boolean isPowerOn;
    private String type;
    public Samsung(String type){
        this.type = type;
    }
    public void powerOn(){
        if(isPowerOn) System.out.println("Handphone telah dinyalakan"); 
        else System.out.println("Berhasil dinyalakan");
        this.isPowerOn = true;
    }
    public void powerOff(){
        if(isPowerOn) System.out.println("Handphone telah dimatikan");
        else System.out.println("Berhasil dimatikan");
        this.isPowerOn = false;
    }
    public void volumeUp(){
        if(isPowerOn == true){
            if(volume <= maxVolume) volume+=5;
            else System.out.println("Volume sudah mencapai batas maximum");
        }else{
            System.out.println("Your handphone is off");
        }

    }
    public void volumeDown(){
        if(isPowerOn == true){
            if(volume > minVolume) volume-=5;
            else System.out.println("Volume sudah mencapai batas minimum");
        }else{
            System.out.println("Your handphone is off");
        }
    }
    public int getVolume(){
        return this.volume;
    }
    public boolean getStatus(){
        return isPowerOn;
    }
    public String getType(){
        return type;
    }
}
