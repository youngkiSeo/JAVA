package com.green.java.ioc.next;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Tv;
import com.green.java.ioc.Woofer;

public class TvFactory { //객체 생성담당
    public static Tv getInstance(String spekaer){
        Woofer woofer = new BoWoofer();
        switch(spekaer){
            case "Apple":
                Speaker s = new AppleSpeaker(woofer);
                return new SamsungTv(s);
            case "Harman":
                Speaker s2 = new AppleSpeaker(woofer);
                return new SamsungTv(s2);

        } return null;
    }
}
