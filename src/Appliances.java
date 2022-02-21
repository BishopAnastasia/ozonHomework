public class Appliances extends Category {
protected String noise;
    public Appliances(int serialNumber, String portability, String noise) {
        super(serialNumber, portability);
       element = new ClickLine();
       this.noise = noise;
    }

    @Override
    public void open() {
        System.out.println("This Appliances");
    }

    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability + "\nNoise: " + noise;
    }

    {
    }
}
