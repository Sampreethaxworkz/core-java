class Microwave {
     
	 static boolean isConnected ;
	 static int minheat ;
	 static int maxheat = 6;
	 static int currentheat;
	 
     public static boolean onOrOff(){
	    System.out.println("Inside the microwave");
        if(isConnected == false){
		isConnected = true;
		System.out.println("Microwave turned on");
		}else if(isConnected == true){
		isConnected = false;
		System.out.println("Microwave is turned off");
		}
		System.out.println("End of  the Microwave ");
	
	return isConnected;
	 }
	 
	 public static void increaseheat(){
		 if(isConnected == true){
			 if(currentheat < maxheat){
				 currentheat = currentheat+ 1;
				 System.out.println("The  current heat of Microwave is "+currentheat);
			 }else{
				 System.out.println("The maximum heat is reached");				 
			 }
		 }else{
				  System.out.println("Please turn on the Microwave");
			 }
		 
	 }
	 
	 public static void decreaseheat(){
		if(isConnected == true){
			if(currentheat > minheat){
				currentheat =currentheat - 1;
				System.out.println("The current heat of Microwave is "+currentheat);
			}else{
				System.out.println("Minimum heat reached");
			}
		}else{
			System.out.println("Turn on the Microwave");
		}
		System.out.println("End of  the Microwave");
	 	 
	 
	 
	 
	 
	 }
}
