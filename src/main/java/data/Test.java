package data;

public class Test {
	
	
	  @org.testng.annotations.Test(groups = { "viewaccount" })
	    public void viewaccount() {
	        System.out.println("View Your Dashboardd");
	    }
	 
	    @org.testng.annotations.Test(groups = { "openbrowser" })
	    public void OpenBrowser() {
	        System.out.println("Browser Opened Successfully");
	    }
	 
	    @org.testng.annotations.Test(groups = { "login" })
	    public void LogIn() {
	        System.out.println("Login Into The Account");
	    }
	    
	    @org.testng.annotations.Test(groups = {"logout"})
	    public void CloseAccount() {
	     System.out.println("Closing The Account");
	    }

}
