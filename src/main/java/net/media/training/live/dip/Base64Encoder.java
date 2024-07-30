package net.media.training.live.dip;

import java.util.Base64;

public class Base64Encoder implements Encoder {

    @Override
    public String encode(String inputString){
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        return encodedString;
    }
}
