package com.th3.bt01;

import java.util.Arrays;

public class Chuoi {
    String s;

    public Chuoi(String s) {
        this.s = s;
    }


    public void tongMaASCII() {
        int tong = 0;
        for (int i = 0; i < this.s.length(); i++) {
            tong = tong + this.s.charAt(i);
        }
        System.out.println("Tổng các mã ACSII: " + tong);
    }

    public void sapXepASCII() {
        int[] mangASCII = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            mangASCII[i] = s.charAt(i);
        }
        Arrays.sort(mangASCII);
        for (int i = 0; i < s.length(); i++) {
            System.out.print((char) mangASCII[i] + "\t");
        }
    }

    public void inChuHoa() {
        for (int i = 0; i < this.s.length(); i++) {
            if (s.charAt(i) < 97 && s.charAt(i) >= 65) {
                System.out.print(String.valueOf(s.charAt(i)+"\t"));
            }
        }
    }

    public void kiemTraDoiXung() {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(s)) {
            System.out.println("Đây là chuỗi đối xứng");
        } else {
            System.out.println("Dây là chuỗi không đối xứng");
        }
    }

    public void vietHoa() {
        int i = s.indexOf(" ");
        while (i > -1) {
            s = s.replace(s.substring(i, i + 2), s.substring(i, i + 2).toUpperCase());
            i = s.indexOf(" ", i + 1);
        }
        System.out.println(s);
    }

    public void daoNguocTu() {
        int i = 0;
        String[] str = s.split(" ");
        String strKQ = "";
        for (int j = 0; j < str.length; j++) {
            StringBuilder stringBuilder = new StringBuilder(str[j]);
            stringBuilder.reverse();
            strKQ = strKQ + stringBuilder.toString() + " ";
        }
        System.out.println(strKQ);
    }

    public void tongCacChuSo() {
        int tong = 0;
        for (int i = 0; i < s.length(); i++) {
            try {
                Integer.parseInt(String.valueOf(s.charAt(i)));
                tong++;
            } catch (NumberFormatException ignored) {

            }
        }
        System.out.println(tong);
    }

    public void tongCacSo() {
        int tong = 0;
        for (int i = 0; i < s.length(); i++) {
            try {
                Integer.parseInt(String.valueOf(s.charAt(i)));
            } catch (NumberFormatException ignored) {
                s = s.replace(s.substring(i, i + 1), " ");
            }
        }
        int i = 0;
        boDauCach();
        String[] str = s.split(" ");
        for (int j = 0; j < str.length; j++) {
            tong = tong + Integer.parseInt(str[j]);
        }
        System.out.println(tong);
    }

    public String boDauCach() {
        int i = 0;
        while (i > -1) {
            s = s.replace("  ", " ");
            i = s.indexOf(s, i + 1);
            i = s.indexOf("  ");
        }
        return s;
    }

    public void xoaDauUnicode() {
        String unicode = "";
        if (s.contains("á")) {
            s = s.replace("á", "a");
        }
        if (s.contains("à")) {
            s = s.replace("à", "a");
        }
        if (s.contains("ả")) {
            s = s.replace("ả", "a");
        }
        if (s.contains("ã")) {
            s = s.replace("ã", "a");
        }
        if (s.contains("ạ")) {
            s = s.replace("ạ", "a");
        }
        if (s.contains("đ")) {
            s = s.replace("đ", "d");
        }
        if (s.contains("ê")) {
            s = s.replace("e", "e");
        }
        if (s.contains("ế")) {
            s = s.replace("ế", "e");
        }
        if (s.contains("ề")) {
            s = s.replace("ề", "e");
        }
        if (s.contains("ể")) {
            s = s.replace("ể", "e");
        }
        if (s.contains("ễ")) {
            s = s.replace("ễ", "e");
        }
        if (s.contains("ệ")) {
            s = s.replace("ệ", "e");
        }
        if (s.contains("í")) {
            s = s.replace("i", "i");
        }
        if (s.contains("ì")) {
            s = s.replace("ì", "i");
        }
        if (s.contains("ỉ")) {
            s = s.replace("ỉ", "i");
        }
        if (s.contains("ĩ")) {
            s = s.replace("ĩ", "i");
        }
        if (s.contains("ị")) {
            s = s.replace("ị", "i");
        }
        if (s.contains("ô")) {
            s = s.replace("ô", "o");
        }
        if (s.contains("ố")) {
            s = s.replace("ố", "o");
        }
        if (s.contains("ồ")) {
            s = s.replace("ồ", "o");
        }
        if (s.contains("ỗ")) {
            s = s.replace("ỗ", "o");
        }
        if (s.contains("ộ")) {
            s = s.replace("ộ", "o");
        }
        if (s.contains("ơ")) {
            s = s.replace("ơ", "o");
        }
        if (s.contains("ớ")) {
            s = s.replace("ơ", "o");
        }
        if (s.contains("ờ")) {
            s = s.replace("ờ", "o");
        }
        if (s.contains("ở")) {
            s = s.replace("ở", "o");
        }
        if (s.contains("ỡ")) {
            s = s.replace("ỡ", "o");
        }
        if (s.contains("ợ")) {
            s = s.replace("ợ", "o");
        }
        if (s.contains("ú")) {
            s = s.replace("ú", "u");
        }
        if (s.contains("ù")) {
            s = s.replace("ù", "u");
        }
        if (s.contains("ũ")) {
            s = s.replace("ũ", "u");
        }
        if (s.contains("ụ")) {
            s = s.replace("ụ", "u");
        }
        if (s.contains("ắ")) {
            s = s.replace("ắ", "a");
        }
        if (s.contains("ằ")) {
            s = s.replace("ằ", "a");
        }
        if (s.contains("ẵ")) {
            s = s.replace("ẵ", "a");
        }
        if (s.contains("ặ")) {
            s = s.replace("ặ", "a");
        }
        if (s.contains("ấ")) {
            s = s.replace("ấ", "a");
        }
        if (s.contains("ầ")) {
            s = s.replace("ầ", "a");
        }
        if (s.contains("ẫ")) {
            s = s.replace("ẫ", "a");
        }
        if (s.contains("ậ")) {
            s = s.replace("ậ", "a");
        }
        if (s.contains("ă")) {
            s = s.replace("ă", "a");
        }
        if (s.contains("â")) {
            s = s.replace("â", "a");
        }

        System.out.printf(s);
    }
}
