package com.green.java.ch07;
public class MyTv extends Speaker{
    int channel;

    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }

}
class Speaker{
    int volumn;
    void VolumUp(){
        volumn++;
    }
    void VolumDown(){
        volumn--;
    }
}
class MyTV2{
    int channel;
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
    Speaker speaker;
    void VolumUp(){
        speaker.VolumUp();
    }
    void VolumDown(){
        speaker.VolumDown();
    }
    int getVolumn(){
        return speaker.volumn;
    }
}
