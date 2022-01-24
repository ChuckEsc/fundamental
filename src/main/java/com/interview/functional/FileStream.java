package com.interview.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStream {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("bands.txt");
        Stream<String> lines = Files.lines(path);
        lines.forEach(System.out::println);
        lines.close();
    }
}
