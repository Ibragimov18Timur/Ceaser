package com.company;

public class Main {
    public static void main(String[] args) {
        String path;
        Reader reader = new Reader();
        Deshifrator deshifrator = new Deshifrator();

        path = "src/com/company/shifr.txt";
        deshifrator.iterations(reader.readFile(path));
    }
}

