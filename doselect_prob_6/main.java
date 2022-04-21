package doselect_prob_6;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Implementation obj = new Implementation();
		String out= obj.passwordValidator(new Credentials("Steve", "Akjsdhhj@1"));
		String out1=obj.signUp(new Credentials("Bob", "jsdhJS12*&$1"));
         System.out.println(out);
         System.out.println(out1);
		
	}

}
