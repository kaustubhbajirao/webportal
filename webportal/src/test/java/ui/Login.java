package ui;

import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void setup(){
        System.out.println("Setup Test");
    }
   @Test(priority = 2)
    void login(){
        System.out.println("Login Test");
    }
    @Test(priority = 3)
    void teardown(){
        System.out.println("Closing Browser");
    }

}
