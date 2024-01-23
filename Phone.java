package OopsConcept;

class AndroidPhone {
    public void takeVideo() {
        System.out.println("AndroidPhone is taking a video");
    }
    
    public void contextMenu() {
        System.out.println("Context menu on AndroidPhone");
    }

}


class SmartPhone extends AndroidPhone {
    
    public void contextMenu() {
        System.out.println("Context menu on SmartPhone");
    }
}

public class Phone {
    public static void main(String[] args) {
        
        SmartPhone obj = new SmartPhone();

        obj.takeVideo();

        obj.contextMenu();
    }
}


