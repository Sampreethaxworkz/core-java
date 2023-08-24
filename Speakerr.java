class Speakerr{
     
	 static boolean isConnected ;
	 static int minvol ;
	 static int maxvol = 6;
	 static int currentvol ;
	 
     public static boolean onOrOff(){
	    System.out.println("Inside the speakerr");
        if(isConnected == false){
		isConnected = true;
		System.out.println("Speakerr is turned on");
		}else if(isConnected == true){
		isConnected = false;
		System.out.println("Speakerr is turned off");
		}
		System.out.println("End of  the speaker");
	
	return isConnected;
	 }
	 
	 public static void increaseVolume(){
		 if(isConnected == true){
			 if(currentvol < maxvol){
				 currentvol = currentvol+ 1;
				 System.out.println("The  current volume of speakerr is "+currentvol);
			 }else{
				 System.out.println("The maximum volume is reached");				 
			 }
		 }else{
				  System.out.println("Please turn on the speaker");
			 }
		 
	 }
	 
	 public static void decreaseVolume(){
		if(isConnected == true){
			if(currentvol > minvol){
				currentvol =currentvol - 1;
				System.out.println("The current volume of speakerr is "+currentvol);
			}else{
				System.out.println("Minimum Volume reached");
			}
		}else{
			System.out.println("Turn on the speakerr");
		}
		System.out.println("End of  the speakerr");
	 	 
	 
	 
	 
	 
	 }
}
