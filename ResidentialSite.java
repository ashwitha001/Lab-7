public class ResidentialSite extends Site{
    @Override
    public double getBaseAmount(){
        return _units * _rate;
    }
    @Override
    public double getTaxAmount(){
        return getBaseAmount() * Site.TAX_RATE;
    }
}
