public class Tv extends Category{
    protected int diagonal;
    public Tv(int serialNumber, String portability, int volume) {
        super(serialNumber, portability);
        element = new ClickLine();
        this.diagonal=diagonal;
    }

    @Override
    public void open() {
        System.out.println("This tv");
    }
    @Override
    public String toString() {
        return "Parameters:" +
                "\nSerialNumber: " + serialNumber +
                "\nPortability: " + portability + "\nDiagonal"+ diagonal;
    }

}
