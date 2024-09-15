
import PayD.PayD;
import Xpay.Xpay;


public class Main {

    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Champoo CGM48");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);
        PayD payD = new XpaytoPayDAdapter(xpay);
        testPayD(payD);

    }
    private static void testPayD(PayD payD) {
        System.out.println(payD.getCardOwnerName());        
        System.out.println(payD.getCreditCardNo()); 
        System.out.println(payD.getCardExpMonthYear());
    }
    
}
