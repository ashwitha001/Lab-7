public class ResidentialSite extends Site{
    private double _units;
    private double _rate;
    @Override
    public double getBillableAmount(){
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
