public class Televizor extends Category{
    protected int diagonal;
    protected int hdmi;
    protected String color;
    protected String screenRecording;
    public Televizor(int serialNumber, String portability, int diagonal, int hdmi, String color, String screenRecording) {
        super(serialNumber, portability);
        this.diagonal=diagonal;
        this.hdmi=hdmi;
        this.color=color;
        this.screenRecording=screenRecording;
        element = new ClickPic();

    }
    @Override
    public void open() {   System.out.println("This is Televizor");

    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability +
                "\nDiagonal: " + diagonal +
                "\nHDMI: " + hdmi + "\nColor" + color +
                "\nScreenRecording: " + screenRecording;
    }
}