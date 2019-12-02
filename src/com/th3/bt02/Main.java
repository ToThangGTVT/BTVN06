package com.th3.bt02;

public class Main {
    public static void main(String[] args) {
        String s = "3+4-5-6+9+1++-4+-23-10";
        ChuanHoa chuanHoa =  new ChuanHoa();
        System.out.println(chuanHoa.tinhGiaTri(s));
    }
}
