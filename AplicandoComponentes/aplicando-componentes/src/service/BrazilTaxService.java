package service;

public class BrazilTaxService extends TaxService{

    public BrazilTaxService() {

    }
    @Override
    public double tax(double amount) {
        return amount * 0.3;
    }

}
