package doselect47;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	List<String> customerName = new ArrayList<>();
	int roomsBooked=0;
	int flag=0;
	
	public String checkIn(Customer customer) {
		if(roomsBooked<=10) 
		{
			flag=1;
			roomsBooked+=1;
			customerName.add(customer.name);
			return " Checked in";
			
		}
		else
			return "No rooms available";
		
		
	}
	
	public String checkRooms(Customer customer) {
		if(flag==1)
			return "Yes";
		else
			return "No";
		
	}
	

}
