class Student
{
	String name="Naresh Kumar Khatri";
	String rollNumber="18CS47";
	String deptName="Computer System Engineering";
void Display()
{
	System.out.println("Name: "+ name);
	System.out.println("Roll Number: "+rollNumber);
	System.out.println("Department: "+ deptName);
}
	public static void main(String ar[])
	{
		Student s =new Student();
		s.Display();
	}
}