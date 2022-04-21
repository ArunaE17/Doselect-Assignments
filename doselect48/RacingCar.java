package doselect48;
import java.lang.Math;

public class RacingCar {
	int speed;
	int distance;
	int petrolRate;
	public RacingCar(int speed, int distance, int petrolRate) {
		this.speed=speed;
		this.distance=distance;
		this.petrolRate=petrolRate;
	}
	public int validateCar(int time) throws LowSpeedException,HighSpeedException{	
		
		if((Math.ceil(distance/time)) > time) {
			
			throw new LowSpeedException("Upgrade Car");

		}
		else if ((Math.ceil(distance/time)) < time) {
			
			throw new HighSpeedException("Accident Chances");
		}
		else
			
		    return calculateprice();

		
		
		
	}
	public int calculateprice() {
		
		return (int) Math.ceil(distance/petrolRate);
		
	}

}	
	    


