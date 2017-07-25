package SingletonPackage;

public  class Runtime 

	
	{
	
		public static void main(String[] args) 

			{
		
				RunTimeParameters referenceInstance = RunTimeParameters.getSingletonInstance();		
		
				// As per the program we are displaying the default values of the different variaables.


				System.out.println("The default number of users are:" + referenceInstance.getNumberOfUsers());

				System.out.println("The default value of application status is:" + referenceInstance.getApplicationStatus());

				System.out.println("The default value of the version is:" + referenceInstance.getVersion());
		

			}


	}
