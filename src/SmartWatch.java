public class SmartWatch extends Category{
    protected String waterproof;
    protected String compatibility;
    protected String color;
    public SmartWatch(int serialNumber, String portability, String waterproof, String compatibility, String color) {
        super(serialNumber, portability);
        this.waterproof=waterproof;
        this.compatibility=compatibility;
        this.color=color;
        element = new ClickPic();

    }
    @Override
    public void open() {   System.out.println("This is Smart Watch");

    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability + "\nWaterproof: " + waterproof +"\nCompatibility: " +compatibility + "\nColor" + color;
    }
}
