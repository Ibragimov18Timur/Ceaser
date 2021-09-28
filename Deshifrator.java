package com.company;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;


public class Deshifrator {

    public void iterations(char[] ch) {
        char[] mas = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray();
        for (int i = 0; i < 33; i++) {
            System.out.println("\n\nSHIFT = " + i);
            for (int j = 0; j < ch.length; j++) {
                if ((ch[j] == ' ') || (ch[j] == '\n') || (ch[j] == '.') || (ch[j] == ',')) {
                    System.out.print(ch[j]);
                }
                for (int k = 0; k < mas.length; k++) {
                    if (ch[j] == mas[k]) {
                        if (k + i < 33) {
                            System.out.print(mas[k + i]);
                        } else {
                            System.out.print(mas[(k + i) - 33]);
                        }
                    }
                }
            }
        }
    }
}
