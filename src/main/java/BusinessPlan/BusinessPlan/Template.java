/**
 * 
 */
package BusinessPlan.BusinessPlan;

import java.beans.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * @author Courtney and Jack
 *
 */
public class Template
{
	public ArrayList<String> templates;
	public ArrayList<Plan> plans;
	
	//constructor
    public Template()
    {
    	addTemplates();
    }
    
    
    // when templates are added when the constructor is called
    // need to be changed when there is a new plan added
    private void addTemplates()
    {
    	templates.add("VMOSA");
    	templates.add("CENTRE");
    	templates.add("IOWAST");
    }
    
    
    // uses if stmts in order to get the plan
    // stores in Plans list after
    // only other place where existing code need to be changed
    public void makePlan(String templateName, String planTitle)
    {
    	templateName = templateName.toUpperCase();
    	
    	if (templateName == "VMOSA")
    	{
    		Plan Vmosa = new VMOSA();
    		plans.add(Vmosa);
    		Vmosa.setName(planTitle);
    		System.out.println("Vmosa Plan Added");
    		
    	}
    	else if (templateName == "CENTRE")
    	{
    		Plan Centre = new Centre();
    		plans.add(Centre);
    		Centre.setName(planTitle);
    		System.out.println("Centre Plan Added");
    	}
    	else if (templateName == "IOWAST")
    	{
    		Plan IowaST = new IowaState();
    		plans.add(IowaST);
    		IowaST.setName(planTitle);
    		System.out.println("Iowa State Plan Added");
    	}
    	else
    	{
    		throw new IllegalArgumentException("Plan does not exist");
    	}
    }
    
  
    // allows access to Plans stored in the list
    // assumes that person organizing knows which plan is which
   public Plan getPlans(String titleName)
    {
	   for (int i = 0; i < plans.size(); i++)
	   {
		   if (plans.get(i).getName() == titleName)
		   {
			   return plans.get(i);
		   }
	   }
	   throw new IllegalArgumentException("No plan with this title exist");
    }
   
   
   // encodes plans to an xml file
   // know the plan you want to encode
	public void encode(Plan plan, String fileName)
	{
		XMLEncoder encoder=null;
		try
		{
			encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(fileName)));
		}
		catch(FileNotFoundException fileNotFound)
		{
			System.out.println("ERROR: While Creating or Opening the File dvd.xml");
		}
		encoder.writeObject(plan);
		encoder.close();
	}
	
	
	// takes a fileName and returns the plan object to you
	public Plan decode(String fileName)
	{
		XMLDecoder decoder=null;
		try 
		{
			decoder=new XMLDecoder(new BufferedInputStream(new FileInputStream(fileName)));
		} 
			catch (FileNotFoundException e) 
		{
				System.out.println("ERROR: File dvd.xml not found");
		}
		Plan plan = (Plan)decoder.readObject();
		
		return plan;
		
	}
}
