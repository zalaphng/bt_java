package structure.decoration.Bt2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoStopWord extends TokenizeDecorator{

    String[] stopWord = {"hoặc", "và", "thì", "là", "mà"};
    List<String> stopWordList = Arrays.asList(stopWord);

    public LoaiBoStopWord(Tokenize tokenize) {
        super(tokenize);
    }

    @Override
    public List<String> tokenize() {
        List<String> list = tokenize.tokenize();
        List<String> newList = new ArrayList<>();

        for (String s : list) {
            if (!stopWordList.contains(s) && !s.equals(" ")) {
                newList.add(s);
            }
        }
        return newList;
    }
}
