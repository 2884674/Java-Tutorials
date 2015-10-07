public class Date{

	public int day, month, year;
	
	public Date(int d, int m, int y){
		day = d;
		month = m;
		year = y;
	}

	public int setDay(){
		return day;
	}
	
	public int setMonth(){
		return month;
	}
	
	public int setYear(){
		return year;
	}

	public void display(){
		String out =  "Day: "+day+"\nMonth:"+month+"\nYear: "+year+"\n";
        System.out.println(out);
	}
	
	public static void main(String[] args){
		Date d1 = new Date(30, 5, 1994);
		d1.display();
	}	
}
