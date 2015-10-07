
public class Car {
	private String reg, name;
	private double price;
	private int mileage;

	public Car(String n, String r, double p, int m)
	{
		name = n;
		reg = r;
		price = p;
		mileage = m;
	}

	public String r(){
		return r();
	}

	public double p(){
		return p();
	}

	public int m(){
		return m();
	}
	
	public void setPrice(double p){
		price = p;

	}

	public String toString(){
		return "Name: "+name+"\nRegistration: "+reg+"\nPrice: $"+price+"\nMileage: "+mileage+" miles\n";
	}

	public void display(){
		String out =  "Name: "+name+"\nRegistration: "+reg+"\nPrice: $"+price+"\nMileage: "+mileage+" miles\n";
		System.out.println(out);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mondeo = new Car("Mondeo","188934D",39997.99,700);
		mondeo.display();
		Car hyundai = new Car("Hyundai","99478C", 14999.95,1950);
		hyundai.display();
		Car smart = new Car("Smart","75B",3500.00,0);
		smart.display();
		Car subaru = new Car("Subaru","884798C",9500.99,6500);
		subaru.display();
		Car lamborghini = new Car("Lamborghini","1A",2500000.99,150);
		lamborghini.display();
			mondeo.setPrice(25000.95);
			mondeo.display();
			hyundai.setPrice(10000.50);
			hyundai.display();
			smart.setPrice(1500);
			smart.display();
			subaru.setPrice(15000.99);
			subaru.display();
			lamborghini.setPrice(5000000.00);
			lamborghini.display();
		int mileSum = mondeo.mileage+hyundai.mileage+smart.mileage+subaru.mileage+lamborghini.mileage;
		System.out.println(mileSum+" miles overall.");
		double priceSum = mondeo.price+hyundai.price+smart.price+subaru.price+lamborghini.price;
		System.out.println(priceSum+" $ overall.");
	}

}
