package com.zh.excepet;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author yunfeng
 * @date 2022/3/17
 */
public class Checked {
    public static void main(String[] args) {
        readFile("my.txt");
    }

    public static void readFile(String fileName){
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
