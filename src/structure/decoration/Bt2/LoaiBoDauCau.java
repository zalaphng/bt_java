package structure.decoration.Bt2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoDauCau extends TokenizeDecorator{



    public LoaiBoDauCau(Tokenize tokenize) {
        super(tokenize);
    }

    @Override
    public List<String> tokenize() {
        List<String> list = tokenize.tokenize();
        List<String> newList = new ArrayList<>();

        for (String s : list) {
            if (s.equals("")){
                continue;
            }
            else if (s.endsWith(",") || s.endsWith(";")) {
                String[] arr = s.split(",|;");
                String res = arr[arr.length-1];
                newList.add(res);
            } else {
                newList.add(s);
            }
        }

        return newList;
    }
}
