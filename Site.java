public abstract class Site {

    public static double _rate;
    public static double _units;
    public static double TAX_RATE = 1.0;
    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    public abstract double getBaseAmount();
    public abstract double getTaxAmount();
}
