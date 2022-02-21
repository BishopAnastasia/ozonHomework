public class Computer extends Category{
    protected int screenResolution;
    protected String processor;
    protected String color;
    protected String videoCard;
    public Computer(int serialNumber, String portability, int screenResolution, String processor, String color, String videoCard) {
        super(serialNumber, portability);
        this.screenResolution=screenResolution;
        this.processor=processor;
        this.color=color;
        this.videoCard=videoCard;
        element = new ClickPic();

    }
    @Override
    public void open() {   System.out.println("This is Computer");

    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability +
                "\nScreenResolution: " + screenResolution +
                "\nProcessor: " + processor + "\nColor" + color +
                "\nVideoCard: " + videoCard;
    }
}
