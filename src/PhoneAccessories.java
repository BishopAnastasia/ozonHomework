public class PhoneAccessories extends Category{
    protected String waterproof;
    protected String compatibility;
    protected String color;
    protected String material;
    public PhoneAccessories(int serialNumber, String portability, String waterproof, String compatibility, String color, String material) {
        super(serialNumber, portability);
        this.waterproof=waterproof;
        this.compatibility=compatibility;
        this.color=color;
        this.material=material;
        element = new ClickPic();

    }
    @Override
    public void open() {   System.out.println("This is Phone Accessories");

    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability +
                "\nWaterproof: " + waterproof +
                "\nCompatibility: " +compatibility +
                "\nColor" + color + "\nMaterial: " + material;
    }
}
