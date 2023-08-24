class Fan{
     
	 static boolean isConnected ;
	 static int minspeed ;
	 static int maxspeed = 6;
	 static int currentspeed;
	 
     public static boolean onOrOff(){
	    System.out.println("Inside the fan");
        if(isConnected == false){
		isConnected = true;
		System.out.println("Fan turned on");
		}else if(isConnected == true){
		isConnected = false;
		System.out.println("Fan is turned off");
		}
		System.out.println("End of  the Fan");
	
	return isConnected;
	 }
	 
	 public static void increasespeed(){
		 if(isConnected == true){
			 if(currentspeed < maxspeed){
				 currentspeed = currentspeed+ 1;
				 System.out.println("The  current speed of Fan is "+currentspeed);
			 }else{
				 System.out.println("The maximum speed is reached");				 
			 }
		 }else{
				  System.out.println("Please turn on theFan");
			 }
		 
	 }
	 
	 public static void decreasespeed(){
		if(isConnected == true){
			if(currentspeed > minspeed){
				currentspeed =currentspeed - 1;
				System.out.println("The current speed ofFan is "+currentspeed);
			}else{
				System.out.println("Minimum speed reached");
			}
		}else{
			System.out.println("Turn on the Fan");
		}
		System.out.println("End of  the Fan");
	 	 
	 
	 
	 
	 
	 }
}
