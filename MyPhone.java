package OopsConcept;

public class MyPhone extends Iphone{

	public static void main(String[] args) {
		
		Iphone obj = new Iphone();
		
		//Iso Methods
		
		obj.startApp();
        obj.increaseVolume();
        obj.shutdown();
        
        //Iphone Methods
        
        obj.makeCall();
        obj.sendSMS();
		

	}

}
