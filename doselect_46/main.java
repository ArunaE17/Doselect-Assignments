package doselect_46;

public class main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Register user = new Register();
		try {
		String out = user.checkCredentials("tushar@gmailcom","hiiiiii","hiiiiii");
		System.out.println(out);
		}
		catch(Exception e1) {
		System.out.println(e1);
		}

	}
}
