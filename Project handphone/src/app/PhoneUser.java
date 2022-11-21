package app;

public class PhoneUser {
    private Phone Phone;

    public PhoneUser(Phone phone){
        this.Phone = phone;
    }
    public void turnOnThePhone(){
        Phone.powerOn();
    }
    public void turnOffThePhone(){
        Phone.powerOff();
    }
    public void makePhoneLouder(){
        Phone.volumeUp();;
    }
    public void makePhoneSilent(){
        Phone.volumeDown();;
    }
    public int getVolume(){
        return Phone.getVolume();
    }
    public String getStatus(){
        String status = Phone.getStatus() ? "On" : "Off";
        return status;
    }
    public String getType(){
        return Phone.getType();
    }
}
