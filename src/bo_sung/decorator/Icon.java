package bo_sung.decorator;

public class Icon extends WidgetDecorator{

    String icon;

    public Icon(Widget child, String icon) {
        super(child);
        this.icon = icon;
    }

    @Override
    public void show() {
        System.out.printf("Icon: " + icon + "\n");
        child.show();
    }
}
