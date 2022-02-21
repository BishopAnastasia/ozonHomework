public class SmartphoneWatch extends Category {
    protected String showTime;
    public SmartphoneWatch(int serialNumber, String portability, String showTime) {
        super(serialNumber, portability);
        element = new ClickLine();
        this.showTime=showTime;
    }

    @Override
    public void open() {
        System.out.println("This smartphone and watch");
    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability + "\nShowTime"+ showTime;
    }

}
