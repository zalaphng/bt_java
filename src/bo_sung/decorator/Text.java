package bo_sung.decorator;

public class Text extends WidgetDecorator {

    String text;

    public Text(Widget child, String text) {
        super(child);
        this.text = text;
    }

    @Override
    public void show() {
        System.out.printf("Text " + text + "\n");
        child.show();
    }
}
