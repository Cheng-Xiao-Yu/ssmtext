package com.tedu._05springmvc;

import java.io.IOException;

public class OpenChrome {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe", "http://www.example.com"});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
