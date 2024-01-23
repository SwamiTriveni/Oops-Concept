package OopsConcept;

public class UpiPayments implements Payments  {
	
	@Override
    public void makePayment() 
	{
		int amt = 15000;
        System.out.println("Making UPI payment of $" + amt);
    }

    @Override
    public void refundPayment() 
    {
    	int refundamt =10000;
        System.out.println("Refunding $" + refundamt + " via UPI");
    }

    @Override
    public void checkBalance() 
    {
        System.out.println("Checking UPI balance");
    }

    // Additional method specific to UPIPayment class
    void sendPaymentRequest( ) 
    {
    	String recipient = "Triveni Swami";
    	int amt = 13000;
        System.out.println("Requesting payment of $" + amt + " from " + recipient);
    }

	public static void main(String[] args) 
	{
		 UpiPayments obj = new UpiPayments();
		 
		 obj.makePayment();
	     obj.refundPayment();
	     obj.checkBalance();

	}

}
