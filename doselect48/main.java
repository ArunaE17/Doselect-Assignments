package doselect48;

public class main {
	public static void main(String[] args) throws Exception  {
		
		RacingCar car = new RacingCar(100,1000,11);
         try {
			System.out.println( car.validateCar(50));
         }
         catch(Exception e1) {
        	 System.out.println(e1);
         }
         

		
				
		
	}

}



