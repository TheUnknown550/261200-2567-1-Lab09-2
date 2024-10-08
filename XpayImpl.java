

import Xpay.Xpay;

public class XpayImpl implements Xpay {
    

    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;
    
    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }
    
    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
    
    @Override
    public String getCustomerName() {
        return customerName;
    }
    
    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    @Override
    public String getCardExpMonth() {
        return cardExpMonth;
    }
    
    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }
    
    @Override
    public String getCardExpYear() {
        return cardExpYear;
    }
    
    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }
    
    public Short getCardCVVNo() {
        return cardCVVNo;
    }
    
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }
    
    public Double getAmount() {
        return amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public void setCardCVVNo(short s) {
        cardCVVNo = s;
    }

    @Override
    public void setAmount(double d) {
        amount = d;
    }
}
