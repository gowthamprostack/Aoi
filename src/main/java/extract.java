import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class extract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		POJOClass p=new POJOClass();
		
		p.setIntructor("gowtham");
		p.setUrl("www.google.com");
		p.setServises("projectsupport");
		p.setExpertise("Automation");
		
	
		Webautomation selenium=new Webautomation();
		Webautomation api=new Webautomation();
		
		selenium.setCoursestitle("selenium");
		selenium.setPrice("30");
		
		api.setCoursestitle("API");
		api.setPrice("20");
		
		List<Webautomation> li=new ArrayList<Webautomation>();
		
		li.add(selenium);
		li.add(api);
		
		
		
		Coursesfile course=new Coursesfile();
		course.setWebautomation(li);
		p.setCourses(course);
		
		System.out.println(p);
		
		
		
		ObjectMapper Obj = new ObjectMapper();
		 
        try {
 
            // get Oraganisation object as a json string
            String jsonStr = Obj.writeValueAsString(p);
 
            // Displaying JSON String
            System.out.println(jsonStr);
        }
 
        catch (IOException e) {
            e.printStackTrace();
        }
		
		
		

	}

}
