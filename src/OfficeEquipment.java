public class OfficeEquipment extends Category{
    protected String compatibility;
    protected String color;
    public OfficeEquipment(int serialNumber, String portability, String compatibility, String color) {
        super(serialNumber, portability);
        this.compatibility=compatibility;
        this.color=color;
        element = new ClickPic();

    }
    @Override
    public void open() {   System.out.println("This is Office Equipment");

    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability +
                "\nCompatibility: " +compatibility + "\nColor" + color;
    }
}
