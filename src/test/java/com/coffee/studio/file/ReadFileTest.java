package com.coffee.studio.file;

import org.junit.Test;

public class ReadFileTest {

    private final ReadFile readFile = new ReadFile();

    @Test
    public void readFileByLine() {
        String fileName = "E:\\1.txt";
        readFile.readFileByLine(fileName);
    }
}
