public class Headphones extends Category{
    protected int volume;
    protected String compatibility;
    protected String color;
    public Headphones(int serialNumber, String portability, int volume, String compatibility, String color) {
        super(serialNumber, portability);
        this.volume=volume;
        this.compatibility=compatibility;
        this.color=color;
        element = new ClickPic();

    }
    @Override
    public void open() {   System.out.println("This is Headphones");

    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability +
                "\nVolume: " + volume +
                "\nCompatibility: " +compatibility + "\nColor" + color;
    }
}
