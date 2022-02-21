public class Audio extends Category{

    protected int volume;
    public Audio(int serialNumber, String portability, int volume) {
        super(serialNumber, portability);
        element = new ClickLine();
        this.volume=volume;
    }

    @Override
    public void open() {
        System.out.println("This headphones and audio equipment ");
    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability + "\nVolume"+ volume;
    }
}
