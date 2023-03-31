package creational.builder.bt5;

import java.util.Arrays;
import java.util.List;

public class MainBook {
    public static void main(String[] args) {
        List<String> chapters = Arrays.asList("Chapter 0. Introduction", "Chapter 1. Introduction to Object", "Chapter 2. Everything in an Object");
        Book b = new Book.Builder()
                .themTuaDe("Thinking in JAVA")
                .themTacGia("Bruce Eckel")
                .themSoTrang(1150)
                .themDanhSachChuong(chapters)
                .build();

        System.out.printf(b.toString());
    }
}
