//Problem link: https://www.naukri.com/code360/guided-paths/oops-in-java/content/279841/offering/3844019 

import java.util.* ;
class Person {	
	// Complete the class
	public int age;
	public String name;

	
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;

	}

	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}


	public void display()
	{
		System.out.println("The name of the person is "+name+" and the age is "+age+".");
	}

}

class Solution {
	
	public static void main(String args[]) {
		
		// Write your code here
		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		Person p=new Person();
		p.setName(name);
		p.setAge(age);
		p.display();


	}
}
		