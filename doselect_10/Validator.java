package doselect_10;



public class Validator {
	public String  validateScore(Student s) throws Exception{
		
		if(s.score.length==0 && s.score.length<=100 ){
			throw new  InvalidScoreException ("Invalid score");
		}
		
		else{
			return " valid score ";
	}

}

	public double  getPercentage(Student s){
		 double percentage;
		  double sum = 0; 
	      int i;

	      for (i = 0; i < s.score.length; i++) {
	          sum += s.score[i];
	      }
		  percentage =sum/s.score.length;
		 if(percentage>=33) {
			 return percentage;
		 }
		 else
			 return 0.0;
	}
}
