package com.th3.bt02;

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

    protected int tinhGiaTri(String s) {
        s = chuanHoa(s);
        int tong = 0;
        s = s.replace("-", "+-");
        String[] k = s.split("\\+");
        for (int i = 0; i < k.length; i++) {
            tong = tong + Integer.parseInt(k[i]);
        }
        return tong;
    }

}
