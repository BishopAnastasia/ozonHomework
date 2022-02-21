public abstract class Category {
    Element element;
    protected int serialNumber;
    protected String portability;

    public Category(int serialNumber, String portability) {
        this.serialNumber = serialNumber;
        this.portability = portability;

    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPortability(){
        return portability;
    }
    public void setPortability(String portability) {
        this.portability = portability;
    }


    public abstract void open();

    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability" + portability + "\n";
    }
}
