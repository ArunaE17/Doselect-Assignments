package doselect_46;

public class Register {
	public String checkCredentials(String email, String pass, String cpass) throws Exception{
		if((!email.contains("@"))||(!email.contains(".")))
			throw new InvalidEmailException("Invalid Email");
		else if(pass.length()<6)
			throw new InvalidPasswordException("Invalid Password");
		else if(cpass!=pass)
			throw new PasswordNotMatchException("Password not match");
		else
			return "Registered";
		
	}
	
}