package structure.decoration.Bt2;

import java.util.List;

public class MainBt2 {

    public static String ToString(List<String> str) {
        String s = "";
        for (var w : str) {
            s += " " + w;
        }
        return s.toString();
    }

    public static void main(String[] args) {

        String s = "Test hoặc Sentences Sentences, thì Sentences là Sentences;";
        Tokenize t = new Token(s);
        System.out.printf("" + ToString(t.tokenize()));

        System.out.printf("\nMảng sau loại bỏ dấu\n");
        t = new LoaiBoDauCau(t);
        System.out.printf("" + ToString(t.tokenize()));

        System.out.printf("\nMảng sau loại bỏ stop word\n");
        t = new LoaiBoStopWord(t);
        System.out.printf("" + ToString(t.tokenize()));
    }
}
