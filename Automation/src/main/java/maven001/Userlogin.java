package maven001;

import java.util.ResourceBundle;

public class Userlogin {
	
	public int Userlogin(String user, String password)
	{
		ResourceBundle rb= ResourceBundle.getBundle("Config");
		
		String un =rb.getString("username");
		String pwd =rb.getString("passwo");
		
		if (user.equals(un) && password.equals(pwd))
			return 1;
		else
			return 0;
	}

}
