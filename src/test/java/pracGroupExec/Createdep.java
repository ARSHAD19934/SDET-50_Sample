package pracGroupExec;

import org.testng.annotations.Test;

public class Createdep {
	public class Createbranch {

		@Test(groups = "smoke")
		public void Adddep() {
			System.out.println("Added");
		}

		@Test(groups = "regression")
		public void Editdep() {
			System.out.println("Edited");
		}
			
}
}
