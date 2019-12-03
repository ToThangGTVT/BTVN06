package com.th3.bt02;

import com.th3.bt03.TongHieu;

public class ChuanHoa {
    private boolean dau;
    private int i;

    private String chuanHoa(String s) {
        while (kiemTraDauCanhNhau(s)) {
            kiemTraDauDauTien(s);
            if (dau) {
                if (s.charAt(i + 1) == '-') {
                    s = s.replaceFirst("\\+-", "-");
                } else {
                    s = s.replaceFirst("\\+\\+", "+0+");
                }
            } else {
                if (s.charAt(i + 1) == '+') {
                    s = s.replaceFirst("-\\+", "-");
                } else {
                    s = s.replaceFirst("--", "-0-");
                }
            }
        }
        System.out.println(s);
        return s;
    }

    private boolean kiemTraDauCanhNhau(String s) {
        if (s.contains("+-")) {
            return true;
        } else if (s.contains("-+")) {
            return true;
        } else if (s.contains("++")) {
            return true;
        } else if (s.contains("--")) {
            return true;
        } else {
            return false;
        }
    }

    private void kiemTraDauDauTien(String s) {
        for (i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '+' && s.charAt(i + 1) == '-') || (s.charAt(i) == '+' && s.charAt(i + 1) == '+')) {
                dau = true;
                return;
            } else if ((s.charAt(i) == '-' && s.charAt(i + 1) == '+') || (s.charAt(i) == '-' && s.charAt(i + 1) == '-')) {
                dau = false;
                return;
            }
        }
    }

    protected String tinhGiaTri(String s) {
        TongHieu tongHieu = new TongHieu();
        s = chuanHoa(s);
        String tong = "";
        s = s.replace("-", "+-");
        String[] k = s.split("\\+");
        for (int i = 0; i < k.length; i++) {
            if(k[i].contains("-")){
                tong =tongHieu.tinhHieu(tong,k[i].replace("-",""));
            } else {
                tong =tongHieu.tinhTong(tong,k[i]);
            }
        }
        return tong;
    }
}
