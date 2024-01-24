package OopsConcept;

public class StudentDemo
{
	private String name;
	private int age;
	
	public void setName(String name) 
	{
        this.name = name;
    }
	
	public String getName()
	{
		return name;
	
	}
	
	
	public void setAge(int age) 
	{
		if(age >=0)
		{
			this.age = age;
		}
		else
		{
			System.out.println("Age is not valid");
		}
        
    }
	
	public int getAge()
	{
		return age;
	
	}
	

	public static void main(String[] args)
	{
		StudentDemo obj = new StudentDemo();
		
		obj.setName("Sharvil");
        obj.setAge(3);

        
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj .getAge());

	}

}
