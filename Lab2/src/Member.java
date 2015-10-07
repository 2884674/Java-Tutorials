public class Member {
		public int age;
		public char gender;
		public String name;
		
		
	public Member(String n, int a, char g){//Constructor used to create the object with a string of n, an int of a, and a char of g.
		name = n;
		age = a;
		gender = g;
	}
	
						public String n()
					 	{
					 		return n();
					 	}
						
						public int a()
						{
							return a();
						}
						
						public char s()
						{
							return s();
						}
						
	public void display()//Used to format how it gets displayed on the screen
	{
		String out =  "Name: "+name+"\nAge:"+age+"\nGender: "+gender+"\n";
        System.out.println(out);
	}
	
	
	public static void main(String[] args) {
		// WHERE PROGRAM DISPLAYS
		Member m1 = new Member("John", 21, 'm');
		m1.display();
		Member m2 = new Member("Michael", 35, 'm');
		m2.display();
			if(m1.age < m2.age){
				System.out.println(m1.name+" is the younger man.\n");
			}
			else if(m2.age < m1.age){
				System.out.println(m2.name+" is the younger man.\n");
			}
		Member f1 = new Member("Mary", 20, 'f');
		f1.display();
		Member f2 = new Member("Jacky", 25, 'f');
		f2.display();		
			if(f1.age < f2.age){
				System.out.println(f1.name+" is the younger woman.\n");
			}
			else if(f2.age < f1.age){
				System.out.println(f2.name+"is the younger woman.\n");
			}
	}
	

}
