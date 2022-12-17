package neoflex.adapter;

public class Computer {

    public void connect(USB usb) {
        usb.connect();
        System.out.println("Computer is connected.");
    }

}
