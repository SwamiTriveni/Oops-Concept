package OopsConcept;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator obj = new Calculator();

        // Call the add methods
        int addition1 = obj.add(5, 18);
        System.out.println("Result of adding two integers: " + addition1);

        int addition2 = obj.add(3, 7, 22);
        System.out.println("Result of adding two integers: " + addition2);

        // Call the multiply methods
        double mult1 = obj.multiply(12.5, 3.5);
        System.out.println("Result of multiplying two doubles: " + mult1);

        float mult2 = obj.multiply(1.7f, 2.5f);
        System.out.println("Result of multiplying two floats: " + mult2);
    }
	}


