public class Laptops extends Category{

  protected int volume;

    public Laptops(int serialNumber, String portability, int volume) {
        super(serialNumber, portability);
        element = new ClickLine();
        this.volume = volume;
    }

    @Override
    public void open() {
        System.out.println("this laptops");
    }

    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability + "\nVolume: " + volume;
    }
}
