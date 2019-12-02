package com.th3.bt03;

public class TongHieu {
    protected String tinhTong(String a1, String b1) {
        StringBuilder a = new StringBuilder(a1);
        StringBuilder b = new StringBuilder(b1);
        a.reverse();
        b.reverse();
        int n;
        int phanThua = 0;
        StringBuilder ketQua = new StringBuilder();
        n = Math.min(a.length(), b.length());

        for (int i = 0; i < n; i++) {
            int hangTu1 = Integer.parseInt(a.substring(i, i + 1));
            int hangTu2 = Integer.parseInt(b.substring(i, i + 1));
            int temp = hangTu1 + hangTu2;
            if (i <=n-1) {
                if (String.valueOf(temp).length() >= 2) {
                    ketQua.insert(0, Integer.parseInt(String.valueOf(temp).substring(1)) + phanThua);
                } else if (String.valueOf(temp).length() == 1) {
                    ketQua.insert(0, Integer.parseInt(String.valueOf(temp)) + phanThua);
                }
                if (String.valueOf(temp).length() >= 2) {
                    phanThua = Integer.parseInt(String.valueOf(temp).substring(0, 1));
                }
            } else {
                ketQua.insert(0, Integer.parseInt(String.valueOf(temp)) + phanThua);
            }
        }

        if(a.length()!=b.length()||phanThua!=0){
            n = Math.max(a.length(), b.length());
            String phanKhongCong;
            StringBuilder phanKhongCongReverse;
            int m;
            if(a.length()>=b.length()){
                m = Math.min(a.length(), b.length());
                phanKhongCong = a.toString().substring(m,n);
                phanKhongCongReverse = new StringBuilder(phanKhongCong).reverse();
            } else {
                m = Math.min(a.length(), b.length());
                phanKhongCong = b.toString().substring(m,n);
                phanKhongCongReverse = new StringBuilder(phanKhongCong).reverse();
            }
            if(phanThua==0){
                ketQua.insert(0,phanKhongCongReverse);
                return ketQua.toString();
            }
            ketQua.insert(0,tinhTong(phanKhongCongReverse.toString(),String.valueOf(phanThua)));
        }
        return ketQua.toString();
    }

    protected String tinhHieu(String a1, String b1) {
        StringBuilder a = new StringBuilder(a1);
        StringBuilder b = new StringBuilder(b1);
        a.reverse();
        b.reverse();
        int n;
        int phanThua = 0;
        StringBuilder ketQua = new StringBuilder();
        n = Math.min(a.length(), b.length());

        for (int i = 0; i < n; i++) {
            int hangTu1 = Integer.parseInt(a.substring(i, i + 1));
            int hangTu2 = Integer.parseInt(b.substring(i, i + 1));
            int temp = hangTu1 - hangTu2;
            while (temp<0){
                phanThua++;
                temp = Integer.parseInt(phanThua +String.valueOf(hangTu1)) - hangTu2;
            }
            String sa = "";
            sa = sa+ phanThua+a.substring(i,i+1);
            int temp2 = Integer.parseInt(sa)-hangTu2;
            if(String.valueOf(temp2).length()>1){
                ketQua.insert(0,String.valueOf (temp2).substring(1));
            } else {
                ketQua.insert(0,temp2);
            }

        }

        if(a.length()!=b.length()){
            n = Math.max(a.length(), b.length());
            String phanKhongCong;
            StringBuilder phanKhongCongReverse;
            int m;
            if(a.length()>b.length()){
                m = a.length()-b.length();
                phanKhongCong = a.toString().substring(m-1,n);
                phanKhongCongReverse = new StringBuilder(phanKhongCong).reverse();
            } else {
                m = b.length()-a.length();
                phanKhongCong = b.toString().substring(m-1,n);
                phanKhongCongReverse = new StringBuilder(phanKhongCong).reverse();
            }
            ketQua.insert(0,Integer.parseInt(String.valueOf(phanKhongCongReverse))-phanThua);
        }
        return ketQua.toString();
    }

}
