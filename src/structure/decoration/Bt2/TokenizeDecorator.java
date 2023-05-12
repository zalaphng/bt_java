package structure.decoration.Bt2;

import java.util.List;

public abstract class TokenizeDecorator extends Tokenize{

    Tokenize tokenize;

    public TokenizeDecorator(Tokenize tokenize) {
        this.tokenize = tokenize;
    }

    public abstract List<String> tokenize();
}
