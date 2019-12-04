package com.th3;

public class vd {
    public static void main(String[] args) {
        chuanHoa("9++-34");
    }
    public static void chuanHoa(String s){
        while (s.contains("-+")){
            s = s.replace("-+","-");
        }
        while (s.contains("+-")){
            s = s.replace("+-","-");
        }
        while (s.contains("--")){
            s = s.replace("--","+0+");
        }
        while (s.contains("++")){
            s = s.replace("++","-0-");
        }
        System.out.println(s);
    }

}
