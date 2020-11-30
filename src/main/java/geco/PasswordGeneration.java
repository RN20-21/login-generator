package geco;

import java.util.Random;

public class PasswordGeneration {
    private String pwd;

    public PasswordGeneration(){
        pwd="";
        Random rand = new Random();

        for(int i=0;i<8;i++){
            char c = (char)(rand.nextInt(26) + 97);
            pwd = pwd+c;
        }
    }

    public String getRandomPassword(){
        return pwd;
    }
}
