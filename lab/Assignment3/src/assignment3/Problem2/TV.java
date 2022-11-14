
package assignment3.Problem2;
public class TV {
    int channel;
    int volumeLevel;
    boolean on;
    TV()
    {
        
    }
    public void turnOn()
    {
        if (on==true)
        {
            System.out.println("TV is on");
        }
    }   
    public void turnOff()
    {
         if (on==false)
        {
            System.out.println("TV is off");
        }  
    }
    public void setChannel(int newChannel)
    {
        channel=newChannel;
    }
    public void setVolume(int newVolumeLevel)
    {
        volumeLevel=newVolumeLevel;
    }  
    public void channelUp()
    {
        System.out.println("New channel is " +(channel++));
    }
    public void channelDown()
    {
         System.out.println("New channel is " +(channel--));
    }
    public void volumeUp()
    {
        System.out.println("New volume is " +(volumeLevel++)); 
    }
    public void volumeDown()
    {
        System.out.println("New volume is " +(volumeLevel--)); 
    }    
}
