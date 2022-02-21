public class ConsoleGame extends Category{

    protected String joystick;
    public ConsoleGame(int serialNumber, String portability, String joystick) {
        super(serialNumber, portability);
        element = new ClickLine();
        this.joystick=joystick;
    }

    @Override
    public void open() {
        System.out.println("This headphones and audio equipment ");
    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability + "\nJoystick"+ joystick;
    }
}

