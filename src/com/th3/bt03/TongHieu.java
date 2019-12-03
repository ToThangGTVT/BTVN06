package com.th3.bt03;

public class TongHieu {
    public String tinhTong(String a1, String b1) {
        boolean am = false;
        if (a1.contains("-") && b1.contains("-")) {
            am = true;
            a1 = a1.replace("-", "");
            b1 = b1.replace("-", "");
        } else if (a1.contains("-") && !b1.contains("-")) {
            a1 = a1.replace("-", "");
            return tinhHieu(b1, a1);
        } else if (b1.contains("-") && !a1.contains("-")) {
            b1 = b1.replace("-", "");
            return tinhHieu(a1, b1);
        }

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
            if (i <= n - 1) {
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

        if (a.length() != b.length() || phanThua != 0) {
            n = Math.max(a.length(), b.length());
            String phanKhongCong;
            StringBuilder phanKhongCongReverse;
            int m;
            if (a.length() >= b.length()) {
                m = Math.min(a.length(), b.length());
                phanKhongCong = a.toString().substring(m, n);
                phanKhongCongReverse = new StringBuilder(phanKhongCong).reverse();
            } else {
                m = Math.min(a.length(), b.length());
                phanKhongCong = b.toString().substring(m, n);
                phanKhongCongReverse = new StringBuilder(phanKhongCong).reverse();
            }
            if (phanThua == 0) {
                ketQua.insert(0, phanKhongCongReverse);
                return ketQua.toString();
            }
            ketQua.insert(0, tinhTong(phanKhongCongReverse.toString(), String.valueOf(phanThua)));
        }
        if (am) {
            return ketQua.insert(0, "-").toString();
        } else {
            return ketQua.toString();
        }
    }

    public String tinhHieu(String a1, String b1) {
        if (b1.contains("-") && !a1.contains("-")) {
            b1 = b1.replace("-", "");
            return tinhTong(a1, b1);
        } else if (a1.contains("-") && !b1.contains("-")) {
            StringBuilder stringBuilder = new StringBuilder(b1);
            stringBuilder.insert(0, "-");
            a1 = stringBuilder.toString();
            return tinhTong(a1, b1);
        } else if(a1.contains("-")&&(b1.contains("-"))){
            String strTemp = a1;
            a1 = b1;
            b1 = strTemp;
        }

        boolean am = false;
        if (a1.length() < b1.length()) {
            String strTemp = a1;
            a1 = b1;
            b1 = strTemp;
            am = true;
        } else if (a1.compareTo(b1) < 0) {
            String strTemp = a1;
            a1 = b1;
            b1 = strTemp;
            am = true;
        }

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
            if (temp < 0 && i == 0) {
                phanThua++;
                temp = Integer.parseInt(phanThua + String.valueOf(hangTu1)) - hangTu2;
                ketQua.insert(0, temp);
            } else if (temp < 0 && i > 0) {
                temp = Integer.parseInt(phanThua + String.valueOf(hangTu1)) - hangTu2 - phanThua;
                ketQua.insert(0, temp);
                phanThua = 1;
            } else if (temp == 0) {
                ketQua.insert(0, temp);
            } else if (temp > 0) {
                ketQua.insert(0, hangTu1 - hangTu2);
            }
        }

        if (a.length() != b.length()) {
            n = Math.max(a.length(), b.length());
            String phanKhongCong;
            StringBuilder phanKhongCongReverse;
            int m;
            if (a.length() > b.length()) {
                m = Math.min(a.length(), b.length());
                phanKhongCong = a.toString().substring(m, n);
                phanKhongCongReverse = new StringBuilder(phanKhongCong).reverse();
            } else {
                m = Math.min(a.length(), b.length());
                phanKhongCong = b.toString().substring(m, n);
                phanKhongCongReverse = new StringBuilder(phanKhongCong).reverse();
            }
            if (phanThua == 0) {
                ketQua.insert(0, phanKhongCongReverse);
                if (am) {
                    return ketQua.insert(0, "-").toString();
                }
                return ketQua.toString();
            }
            ketQua.insert(0, tinhHieu(phanKhongCongReverse.toString(), String.valueOf(phanThua)));
        }
        if (am) {
            return ketQua.insert(0, "-").toString();
        }
        return ketQua.toString();
    }
}
