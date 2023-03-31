package behavioral.observer.A2_Console;

public class Subject_A2 {
    OnClickListener listener;
    public void attach (OnClickListener listener){

    }

    public void detach (OnClickListener listener){

    }

    public void click(){

    }

    public static interface OnClickListener {
        public void onClick();
    }
}
