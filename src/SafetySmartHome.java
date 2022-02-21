public class SafetySmartHome extends Category{
    protected int volume;
    protected String camera;
    protected String alarmSystem;
    public SafetySmartHome(int serialNumber, String portability, int volume, String camera, String alarmSystem) {
        super(serialNumber, portability);
        this.volume=volume;
        this.camera=camera;
        this.alarmSystem=alarmSystem;
        element = new ClickPic();

    }
    @Override
    public void open() {   System.out.println("This is Safety, SmartHome");

    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability +
                "\nVolume: " + volume +
                "\nCamera: " +camera + "\nAlarmSystem" + alarmSystem;
    }
}
