import PayD.PayD;

public class PayDImpl implements PayD {
    private long ccNumber;
    private String cardOwnerName;
    private String cardExpMonthYear;
    private String creditCardNo;
    
    @Override
    public long getCC() {
        return ccNumber;
    }
    
    @Override
    public void setCC(long ccNumber) {
        this.ccNumber = ccNumber;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public String getCardExpMonthYear() {
        return cardExpMonthYear;
    }

    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }
    
}
