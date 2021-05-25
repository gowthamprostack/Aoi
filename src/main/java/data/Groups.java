package data;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Groups {

	@Parameters({"text"})
	 @Test
	    public void starting_point(String s){
	    	System.out.println("This is the starting point of the test"+s);
	    	//Initialize Chrome Driver
	    	//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	  
	    }
	    
	    
	    @Test(groups = { "demo" }) 
	    public void checkTitle() { 
	       String testTitle = "Free QA Automation Tools For Everyone";
	       System.out.println("Home Page heading is displayed"); 
	      
	    } 
	    
	    @Test(groups = { "demo" }) 
	    public void click_elementone() { 
	     
	        System.out.println("Home Page heading is displayed"); 
	    }
	
	
	
	    
	    @Test(groups = { "demotwo" }) 
	    public void checkTitletwo() { 
	       String testTitle = "Free QA Automation Tools For Everyone";
	       System.out.println("Home Page heading is displayed"); 
	      
	    } 
	    
	    @Test(groups = { "demotwo" }) 
	    public void click_element() { 
	     
	        System.out.println("Home Page heading is displayed"); 
	    }
	
	
	
	
}
