package structure.decoration.Bt2;

import java.util.Arrays;
import java.util.List;

public class Token extends Tokenize{

    public Token(String string) {
        this.string = string;
    }

    String string;

    @Override
    public List<String> tokenize() {
        String[] arr = string.split(" ");
        return Arrays.asList(arr);
    }
}
