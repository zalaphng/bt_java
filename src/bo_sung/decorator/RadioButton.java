package bo_sung.decorator;

public class RadioButton extends WidgetDecorator{

    String label;

    public RadioButton(Widget child, String label) {
        super(child);
        this.label = label;
    }

    @Override
    public void show() {
        System.out.printf("RadioButton " + label + "\n");
        child.show();
    }
}
