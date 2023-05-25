package bo_sung.decorator;

import java.util.function.Function;

public class Button extends WidgetDecorator{

    String label;

    MyFunction onpress;

    public Button(Widget child, String label, MyFunction onpress) {
        super(child);
        this.label = label;
        this.onpress = onpress;
    }

    @Override
    public void show() {
        System.out.printf("Button: " + label + "\n");
        onpress.execute();
        child.show();
    }
}

interface MyFunction {
    void execute();
}
