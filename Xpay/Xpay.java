package Xpay;
public interface Xpay{
    public String getCreditCardNo();
    public void setCreditCardNo(String creditCardNo);

    public String getCardExpMonth();

    public void setCardExpMonth(String substring);

    public void setCardExpYear(String substring);

    public String getCardExpYear();

    public void setCardCVVNo(short s);

    public void setAmount(double d);
    public void setCustomerName(String string);
    public String getCustomerName();
    
}
