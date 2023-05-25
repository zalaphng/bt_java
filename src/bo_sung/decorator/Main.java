package bo_sung.decorator;

public class Main {
    public static void main(String[] args) {

        Widget widget = new BaseWidget();
        widget = new Icon(widget, "Icons.Data");
        widget = new Text(widget, "Text Widget");
        widget = new Button(widget, "Test Button", new MyFunction() {
            @Override
            public void execute() {
                System.out.printf("TestButton execute\n");
            }
        });
        widget = new RadioButton(widget, "RadioButton");
        widget = new Center(widget);

        widget.show();

    }
}
