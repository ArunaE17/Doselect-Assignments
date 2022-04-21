package doselect_10;

public class main {

	public static void main(String[] args)throws Exception{
		int score[] = {50,40,80,67,69};
		Student s = new Student("Aman",score);
		Validator val = new Validator();
		String ans = val.validateScore(s);
		double per =  val.getPercentage(s);
       System.out.println("ans ="+ans);
       System.out.println("per ="+per);

}
}