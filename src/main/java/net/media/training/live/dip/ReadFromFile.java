package net.media.training.live.dip;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile implements Reader {

    public String read(){
        StringBuilder inputString = new StringBuilder();
        String aLine;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt"));
            while((aLine = reader.readLine()) != null){
                inputString.append(aLine).append("\n");
            }
            reader.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String inpuString1 = inputString.toString();
        return inpuString1;
    }
    
}
