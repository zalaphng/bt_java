package bo_sung.decorator;

public abstract class WidgetDecorator extends Widget{
    Widget child;

    public WidgetDecorator(Widget child) {
        this.child = child;
    }

    @Override
    public abstract void show();
}
