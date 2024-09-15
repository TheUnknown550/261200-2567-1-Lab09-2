package PayD; // Corrected package name

public interface PayD {
    public long getCC();
    public void setCC(long ccNumber);

    public String getCardOwnerName();

    public String getCardExpMonthYear();

    public String getCreditCardNo();
}
