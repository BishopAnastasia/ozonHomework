public class Tablet extends Category{
    protected int screenResolution;
    protected int camera;
    protected String color;
    protected String stylus;
    public Tablet(int serialNumber, String portability, int screenResolution, int camera, String color, String stylus) {
        super(serialNumber, portability);
        this.screenResolution=screenResolution;
        this.camera=camera;
        this.color=color;
        this.stylus=stylus;
        element = new ClickPic();

    }
    @Override
    public void open() {   System.out.println("This is Tablet");

    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability +
                "\nScreenResolution: " + screenResolution +
                "\nCamera: " + camera + "\nColor" + color +
                "\nStylus: " + stylus;
    }
}
