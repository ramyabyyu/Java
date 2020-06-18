/*
* StringTokenizer
*
*  memungkinkan aplikasi untuk memecah String menjadi beberapa tokens.
*  method StringTokenizer tidak membedakan antara pengidentifikasi, number, dan String yang dikutip
*  dan tidak akan memperdulikan comments.
* by : Ramy Abyyu
* */


package com.StringTokenizer;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello my name is Ramy");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

       String[] result = "Hello my name is Ramy and I am cool".split("\\s");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
