package cn.njupt.day10.Demo04;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();

//        Mouse mouse=new Mouse();
        USB usbMouse=new Mouse();
        computer.useDevice(usbMouse);

        Keyboard keyboard=new Keyboard();
        computer.useDevice(keyboard);

        computer.powerOff();
    }
}
