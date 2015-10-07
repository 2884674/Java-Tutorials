public class Email{

	private String home, work;
	
	public Email(String h, String w){
		home = h;
		work = w;
	}

	public String setHome(){
		return home;
	}
	
	public String setWork(){
		return work;
	}
	

	public void display(){
		String out =  "Home E-Mail: "+home+"\nWork E-Mail: "+work+"\n";
        System.out.println(out);
	}
	
	public static void main(String[] args){
		Email e1 = new Email("sephyno4@hotmail.com", "dbarry94@hotmail.com");
		e1.display();
	}	
}
