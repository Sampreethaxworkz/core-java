class Mixer{
     
	 static boolean isConnected ;
	 static int minspeed ;
	 static int maxspeed = 4;
	 static int currentspeed;
	 
     public static boolean onOrOff(){
	    System.out.println("Inside the Mixer");
        if(isConnected == false){
		isConnected = true;
		System.out.println("Mixeris turned on");
		}else if(isConnected == true){
		isConnected = false;
		System.out.println("Mixer is turned off");
		}
		System.out.println("End of  the Mixer");
	
	return isConnected;
	 }
	 
	 public static void increasespeed(){
		 if(isConnected == true){
			 if(currentspeed < maxspeed){
				 currentspeed = currentspeed+ 1;
				 System.out.println("The  current speed of Mixer is "+currentspeed);
			 }else{
				 System.out.println("The maximum speed is reached");				 
			 }
		 }else{
				  System.out.println("Please turn on the Mixer");
			 }
		 
	 }
	 
	 public static void decreasespeed(){
		if(isConnected == true){
			if(currentspeed > minspeed){
				currentspeed =currentspeed - 1;
				System.out.println("The current speed of Mixer is "+currentspeed);
			}else{
				System.out.println("Minimum speed reached");
			}
		}else{
			System.out.println("Turn on the Mixer");
		}
		System.out.println("End of  the Mixer");
	 	 
	 
	 
	 
	 
	 }
}
