package app;

public interface Phone {
    public int maxVolume = 100;
    public int minVolume = 0;

    public int getVolume();
    public boolean getStatus();
    public String getType();
    public void powerOn();
    public void powerOff();
    public void volumeUp();
    public void volumeDown();
}
