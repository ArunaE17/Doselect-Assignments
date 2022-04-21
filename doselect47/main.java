package doselect47;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust=new Customer("Doselect", 4);
		Hotel hotel=new Hotel();
		String out =hotel.checkIn(cust);
		System.out.println(out);


	}

}
