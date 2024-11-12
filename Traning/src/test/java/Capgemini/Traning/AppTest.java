package Capgemini.Traning;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    public static void main(String args[])
    {
    	App app=new App();
    	String regex1="^(.+)@(.+)$";
    	String regex2="^\\d+$";
		String email=app.userEmail("cap@gmail.com");
		Pattern pattern1 =Pattern.compile(regex1);
		Matcher match1=pattern1.matcher(email);
		System.out.println("Email matched ::"+match1.matches());
		String pwd=app.Password("1234");
		Pattern pattern2 =Pattern.compile(regex2);
		Matcher match2=pattern2.matcher(pwd);
		System.out.println("Password matched ::"+match2.matches());
		if(match1.matches()&&match2.matches())
		app.login();
		else
			System.out.println("Enter correct email");
    }
    
}
