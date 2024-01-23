package OopsConcept;

public interface Payment 
{
	void cashOnDelivery();
    void upiPayments();
    void cardPayments();
    void internetBanking();
}

abstract class SingaporeBank implements Payment
{ 
    
    abstract void recordPaymentDetails();

}

class Amazon extends SingaporeBank {
    @Override
    public void cashOnDelivery() {
        System.out.println("Cash on Delivery");
    }

    @Override
    public void upiPayments() {
        System.out.println("UPI Payments");
    }

    @Override
    public void cardPayments() {
        System.out.println("Card Payments");
    }

    @Override
    public void internetBanking() {
        System.out.println("Internet Banking Payments");
    }

    @Override
    void recordPaymentDetails() {
        System.out.println("Recording payment details for Amazon ");
    }
}
