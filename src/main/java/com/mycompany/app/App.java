package com.mycompany.app;
import com.mycompany.app.Res;
/**
 * Hello world!
 *
 */
public class App 
{

	public void aux(String user, String pass){
		String API_KEY = "ghp_111111112222222233333333444444441234";
		//Create insecure database SQL string
		String sql = "SELECT id FROM users WHERE username='" + user + "' AND password='" + pass + "'";
		Res res = new Res();
	}
    	//API_KEY is xx
	public static void main( String[] args ){
        	System.out.println( "Hello Unbelievably x Crazy World!" );
    		App a = new App();
		a.aux("hello", "world");
	}
}
