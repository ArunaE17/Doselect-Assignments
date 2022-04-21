package doselect_8;

public class main {
	
		public static void main(String[] args) {
		Product1 obj = new Product1("IPhone",25000,"IPhone-10");
		Validator val =new Validator();
		try {
		String valCop = val.validateCoupon(obj);
		System.out.println("valCop = "+valCop);
		}
		catch(Exception e) {
		}
		double price = val.netPrice(obj);
		System.out.println("price = "+price);

		
		}
	}


