/**
 *
 * Run Time parameters which initiates all the default values
 *
 */

package SingletonPackage;

public class RunTimeParameters 
	
	{

	private static RunTimeParameters instance = null;
	
	private int numberOfUsers = 1;
	
	private int applicationStatus = 30;
	
	private double version = 1.0;

	// Private constructor keeps instantiation from different classes
	
	private RunTimeParameters() 
	{

	}
	
	// This is the method where the singleton instance starts.

	public static RunTimeParameters getSingletonInstance()   // This is the way to create the singleton class.
	{
		if (instance==null) 
		{
			
			instance = new RunTimeParameters();			
			
		}
		
		return instance; 		// Here if we try to call the singleton function once again the function will not called. 
							//What ever the values that are initialized previously the same values will displays again aand again.
	}
	
	public int getNumberOfUsers() 
	{	
			return numberOfUsers;
	}

	public void setNumberOfUsers(int numberOfUsers) 
	{
		
			this.numberOfUsers = numberOfUsers;
	}

	public int getApplicationStatus()
	{
		
			return applicationStatus;
	}

	public void setApplicationStatus(int applicationStatus) 
	{
		
			this.applicationStatus = applicationStatus;
	}

	public double getVersion()
	{
		
			return version;
	}

	public void setVersion(double version) 
	{
		
			this.version = version;
	}

}


