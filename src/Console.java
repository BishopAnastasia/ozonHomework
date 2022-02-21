public class Console extends Category{
    protected String type;
    protected String ram;
    protected String platform;
    public Console(int serialNumber, String portability, String type, String ram, String platform) {
        super(serialNumber, portability);
        this.type=type;
        this.ram=ram;
        this.platform=platform;
        element = new ClickPic();

    }
    @Override
    public void open() {   System.out.println("This is Console Game");

    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability +
                "\nType: " + type +
                "\nRAM: " +ram +
                "\nPlatform" + platform;
    }
}
