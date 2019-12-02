package com.th3.bt01;

import java.util.Arrays;

public class Chuoi {
    String s;

    public Chuoi(String s) {
        this.s = s;
    }

    public void tongMaASCII(){
        int tong=0;
        for (int i = 0; i < this.s.length() ; i++) {
            tong = tong + this.s.charAt(i);
        }
        System.out.println("Tổng các mã ACSII: " + tong);
    }

    public void sapXepASCII(){
        int[] mangASCII = new int[s.length()];
        for (int i = 0; i < s.length() ; i++) {
            mangASCII[i] = s.charAt(i);
        }
        Arrays.sort(mangASCII);
        for (int i = 0; i < s.length() ; i++) {
            System.out.print((char)mangASCII[i]+"\t");
        }
    }

    public void inChuHoa(){
        for (int i = 0; i < this.s.length(); i++) {
            if(s.charAt(i)<97 && s.charAt(i)>=65){
                System.out.println(String.valueOf(s.charAt(i)));
            }
        }
    }

    public void kiemTraDoiXung(){
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(s)){
            System.out.println("Đây là chuỗi đối xứng");
        } else {
            System.out.println("Dây là chuỗi không đối xứng");
        }
    }

    public void vietHoa(){
        int i= s.indexOf(" ");
        while (i>-1){
            s = s.replace(s.substring(i,i+2),s.substring(i,i+2).toUpperCase());
            i = s.indexOf("",i+1);
        }

    }
}
