public class Smartphone extends Category{
    protected int screenResolution;
    protected int camera;
    protected String color;
    public Smartphone(int serialNumber, String portability, int screenResolution, int camera, String color) {
        super(serialNumber, portability);
        this.screenResolution=screenResolution;
        this.camera=camera;
        this.color=color;
        element = new ClickPic();

    }
    @Override
    public void open() {   System.out.println("This is Smartphone");

    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability + "\nScreenResolution: " + screenResolution +"\nCamera: " + camera + "\nColor" + color;
    }
}
