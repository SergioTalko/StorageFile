package com;

import com.controllers.FileController;
import com.controllers.MainController;
import com.model.File;
import com.model.Storage;

import java.net.ConnectException;

public class Test {
    public static void main(String[] args) throws ConnectException {



        Storage storage = new Storage();
        storage.setStorageSize(324);
        storage.setFormatsSupported("dsf");
        storage.setStorageCountry("dssdx");
        File file = new File();
        file.setFormat("dvs");
        file.setName("dcs");
        file.setSize(33);



        //fileRepository.put(storage,file);

     //   System.out.println(new Test().palindrome("abgba"));
    }



    /*public boolean isPolindrome(String inputText){

        int i = inputText.length()-1;
        int j = 0;

        while (i > j){
            if (inputText.charAt(i) != inputText.charAt(j)){
                return false;
            }
            i--;
            j++;


        }

        return true;
    }*/

/*    public boolean palindrome(String s){
        s.replace(" ","");

        if(s.length()<2){
            return true;
        }else if(s.charAt(0)==s.charAt(s.length()-1)){
            return palindrome(s.substring(1,s.length()-1)) ;
        }else{
            return false;
        }
    }*/
}
