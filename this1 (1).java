import java.util.*;
class Student
{
	int roll;			//Data Members(3)			//members(5)
	String name;
	float per;


	Student()				//default Constructor
	{
		this.roll=0;
		this.name="XXX";
		this.per=40.0f;
	}
	Student(int r,String n,float p)		//parametrized constructor
	{
		this.roll=r;
		this.name=n;
		this.per=p;
	}
	
	void display()
	{
		
		System.out.println("Roll Number = "+this.roll);
		System.out.println("Name = "+this.name);
		System.out.println("Percentage = "+this.per);
		
	}
	
}
class this1
{
	public static void main(String args[ ])
	{
		Student ob1=new Student(1,"Jay",78.67f);
		
		ob1.display();

		Student ob2=new Student();
		ob2.display();
				
	}
}