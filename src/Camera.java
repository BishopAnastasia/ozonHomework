public class Camera extends Category{
    protected String waterproof;
    protected String autoFocus;
    protected String color;
    protected String formatPic;
    public Camera(int serialNumber, String portability, String waterproof, String autoFocus, String color, String formatPic) {
        super(serialNumber, portability);
        this.waterproof=waterproof;
        this.autoFocus=autoFocus;
        this.color=color;
        this.formatPic=formatPic;
        element = new ClickPic();

    }
    @Override
    public void open() {   System.out.println("This is Camera");

    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability +
                "\nWaterproof: " + waterproof +
                "\nAutoFocus: " +autoFocus +
                "\nColor" + color + "\nFormatPic: " + formatPic;
    }
}
