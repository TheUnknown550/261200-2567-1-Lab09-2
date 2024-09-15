
import PayD.PayD;
import Xpay.Xpay;

public class XpaytoPayDAdapter implements PayD {

    private final Xpay xpay;

    public XpaytoPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
    }

    @Override
    public long getCC() {
        return Long.parseLong(xpay.getCreditCardNo());
    }

    @Override
    public void setCC(long ccNumber) {
        xpay.setCreditCardNo(String.valueOf(ccNumber));
    }

    @Override
    public String getCreditCardNo() {
        return xpay.getCreditCardNo();
    }

    public void setCreditCardNo(String creditCardNo) {
        xpay.setCreditCardNo(creditCardNo);
    }

    @Override
    public String getCardExpMonthYear() {
        return xpay.getCardExpMonth() + "/"
                + xpay.getCardExpYear();
    }

    public void setCardExpMonthYear(String cardExpMonthYear) {
        xpay.setCardExpMonth(cardExpMonthYear.substring(0, 2));
        xpay.setCardExpYear(cardExpMonthYear.substring(3, 2));
    }

    @Override
    public String getCardOwnerName() {
        return xpay.getCustomerName();
    }

}
