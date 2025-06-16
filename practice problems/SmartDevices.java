 class SmartDevice{
    void turnOn()
    {
        System.out.println("Device is turning on.");
    }
    void turnOff(){
        System.out.println("Device is turning off.");
    }
 }
// smartdevice to smartphone
 class SmartPhone extends SmartDevice{
    @Override
    void turnOn(){
        System.out.println("SmartPhone is turning on.");
    }
    @Override
    void turnOff(){
        System.out.println("SmartPhone is turning off.");
    }
 }
 class SmartWatch extends SmartDevice{
    @Override
    void turnOn(){
        System.out.println("SmartWatch is turning on.");
    }
    @Override
    void turnOff(){
        System.out.println("SmartWatch is turning off.");
    }
 }
 public class SmartDevices{
    public static void main(String[] args) {
        SmartDevice phone = new SmartPhone();
        SmartDevice watch = new SmartWatch();

        phone.turnOn();
        phone.turnOff();

        watch.turnOn();
        watch.turnOff();
    }
 }