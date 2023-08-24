class AirConditioner{
     
	 static boolean isConnected ;
	 static int mintemp ;
	 static int maxtemp = 7 ;
	 static int currenttemp ;
	 
     public static boolean onOrOff(){
	    System.out.println("Inside onOrOff");
        if(isConnected == false){
		isConnected = true;
		System.out.println("AirConditioner is turned on");
		}else if(isConnected == true){
		isConnected = false;
		System.out.println("AirCOnditioner is turned off");
		}
		System.out.println("End of  the AirConditioner");
	
	return isConnected;
	 }
	 
	 public static void increaseTemp(){
		 if(isConnected == true){
			 if(currenttemp < maxtemp){
				 currenttemp = currenttemp+ 1;
				 System.out.println("The  current temperature of AirConditioner is "+currenttemp);
			 }else{
				 System.out.println("The maximum temperature is reached");				 
			 }
		 }else{
				  System.out.println("Please turn on the AirConditioner");
			 }
		 
	 }
	 
	 public static void decreaseTemp(){
		if(isConnected == true){
			if(currenttemp > mintemp){
				currenttemp =currenttemp - 1;
				System.out.println("The current temperature of Airconditioner is "+currenttemp);
			}else{
				System.out.println("Minimum temperature is reached");
			}
		}else{
			System.out.println("Turn on the AirConditioner");
		}
		System.out.println("End of  the AirConditioner");
	 	 
	 
	 
	 
	 
	 }
}



















































































