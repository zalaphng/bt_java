package bo_sung.decorator;

public class Center extends WidgetDecorator{
    public Center(Widget child) {
        super(child);
    }

    @Override
    public void show() {
        System.out.printf("Center \n");
        child.show();
    }
}
