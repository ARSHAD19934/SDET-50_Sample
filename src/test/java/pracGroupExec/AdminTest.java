package pracGroupExec;

import org.testng.annotations.Test;

public class AdminTest {
	@Test(groups = "regression")
	public void createAdmin() {
		System.out.println("Admin created");
	}
	
	@Test(groups = "smoke")
	public void runAdmin() {
		System.out.println("run successful as Admin");
	}
	
	@Test
	public void editAdmin(){
		System.out.println("edited as Admin");
	}
}
