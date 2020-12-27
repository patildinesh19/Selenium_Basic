package Inheritance;



public class CreateProfile extends coomanclass 
{
	
	/*public CreateProfile() 
	{
		super();
		System.out.println("I am child constructor");
	}*/

	public static void main (String str[])
	{
	//coomanclass c=new coomanclass();
	coomanclass v=new CreateProfile();
	v.Addmember();
	
	
	// we can access variables and methods of class coomanclass
	
	/*c.Addmember(); // this will access method of coomanclass class
	c.login();
	c.loguot();
	String abc=c.FullName;
	System.out.println("print string abc"+abc);
	int i=c.A;
	System.out.println("Print Integer"+i); */
//	CreateProfile ff = new CreateProfile();
	//ff.Addmember(); //this will access method of CreateProfile class
	
	
	
}
	public void Addmember()
	{
		super.Addmember(); // this will call parent method Addmember() when we want invoke both methods at same time
		System.out.println("Child member added sucessfully");
	}
	public void deletemember()
	{
		System.out.println("member deleted sucessfully");
	}
	
}
