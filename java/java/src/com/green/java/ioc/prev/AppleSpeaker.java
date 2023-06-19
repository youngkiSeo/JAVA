package com.green.java.ioc.prev;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Woofer;

public class AppleSpeaker implements Speaker {
    private Woofer woofer;

    public AppleSpeaker(){
        woofer = new BoWoofer();
    }


    @Override
    public void volumeUp() {
        System.out.println("애플스피커 볼륨업");
        woofer.sound();
    }

    @Override
    public void volumeDown() {
        System.out.println("애플스피커 볼륨다운");
    }
}
