package OopsConcept;

public class PaymentDemo {
	public static void main(String[] args) {
      
        Amazon amazonOrder = new Amazon();

       // Interface method
        amazonOrder.cashOnDelivery();
        amazonOrder.upiPayments();
        amazonOrder.cardPayments();
        amazonOrder.internetBanking();
      //Abtract Class method
        amazonOrder.recordPaymentDetails();

       

    }
}
