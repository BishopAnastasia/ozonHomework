public class Computers extends Category{
    protected int power;
    public Computers(int volume, String portability, int power) {
        super(volume, portability);
        element = new ClickLine();
        this.power=power;
    }

    @Override
    public void open() {
        System.out.println("This computes");
    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability + "\nPower"+ power;
    }
}
