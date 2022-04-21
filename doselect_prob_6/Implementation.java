package doselect_prob_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Implementation {
	public String passwordValidator(Credentials details) throws MissingCharacterException,LengthMismatchException{
		 String passcheck ="^(?=.*[0-9])"
                 + "(?=.*[a-z])(?=.*[A-Z])"
                 + "(?=.*[@#$%^&+=])"
                 + "(?=\\S+$).{8,40}$";
		 Pattern p = Pattern.compile(passcheck);
		 Matcher m = p.matcher(details.password);
		 boolean n = m.matches();
			if(!n) {
				throw new MissingCharacterException("password must contain at least one special character, at least one upper case alphabet, at least one lower case alphabet, and at least one digit ");
			}
			 if( details.password.length() < 8 ||  details.password.length() >40)
			{
				throw new LengthMismatchException("length of the password is not between 8 to 40");
			}
			else
				return "valid password";
		
		
	}
	public String signUp(Credentials details) throws Exception{
		
		try {
			passwordValidator(details);
			
		}
		catch(MissingCharacterException  e1)
		{
			return "invalid password" ;
		}
		catch(LengthMismatchException  e2)
		{
			return "invalid password" ;
		}
		catch(Exception e3)
		{
			return "other exception" ;
		}
		return	"signup successfully";
		
		
		
	}
    

}
