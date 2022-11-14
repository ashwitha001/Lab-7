public class LifelineSite extends Site{

    @Override
    public double getBaseAmount(){
        return _units * _rate * 0.5;
    }
    @Override
    public double getTaxAmount(){
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }
}
