package BusinessPlan.BusinessPlan;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App 
{
	public ArrayList<String> templates;
	public ArrayList<Plan> Plans;
	
	//constructor
    public App()
    {
    	addTemplates();
    }
    
    
    // when App is made then the templates are made
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
    public void makePlan(String name)
    {
    	name = name.toUpperCase();
    	
    	if (name == "VMOSA")
    	{
    		Plan Vmosa = new VMOSA();
    		Plans.add(Vmosa);
    		System.out.println("Vmosa Plan Added");
    		
    	}
    	else if (name == "CENTRE")
    	{
    		Plan Centre = new Centre();
    		Plans.add(Centre);
    		System.out.println("Centre Plan Added");
    	}
    	else if (name == "IOWAST")
    	{
    		Plan IowaST = new IowaState();
    		Plans.add(IowaST);
    		System.out.println("Iowa State Plan Added");
    	}
    	else
    	{
    		System.out.println("No known plan mathces input");
    	}
    }
    
    
    // allows access to Plans stored in the list
    // assumes that person organizing knows which plan is which
    public Plan getPlans(int index)
    {
    	if (Plans.get(index) == null)
    	{
    		System.out.println("You have no plan");
    		return null;
    		
    	}
    	else
    	{
    		System.out.println("You have a plan");
    		return Plans.get(index);
    	}
    }
    
}
