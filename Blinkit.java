class Blinkit

{

 public static double search(String foodName){
    double price=0.0;
	System.out.println("invoked search : foodname(String)");
	if(foodName=="Sandwich")
	{
	price= 110.00;
	return price;
	}
	if(foodName=="Afghani Tikka")
	{
	  price = 350;
	  return price;
	  }
	  if(foodName=="Chicken Tikka")
	  {
	  price = 360;
	  return price;
	  }
	  if(foodName=="Hariyali Kebab")
	  {
	   price = 340;
	  return price;
	  
}
if(foodName=="Margherita")
{
	   price = 239;
	  return price;
	  }
	  if(foodName=="Farmhouse")
	  {
	   price = 459;
	  return price;
	  }
	  if(foodName=="peppy paneer")
	  {
	   price = 460;
	  return price;
	  }
	 
	  if(foodName==" veggie paradise")
	  {
	   price = 459;
	  return price;
	  }
	  if(foodName==" cheese n corn")
	  {
	   price = 379;
	  return price;
	  }
	  if(foodName=="veg extravaganza ")
	  {
	   price = 549;
	  return price;
	  }
	  if(foodName==" Mexican green wave")
	  {
	   price = 459;
	  return price;
	  }
	  if(foodName=="double cheese margherita ")
	  {
	   price = 379;
	  return price;
	  }
	  if(foodName=="Chicken Lollypop")
	  {
	   price = 310;
	  return price;
	  }
	  
	  if(foodName=="fresh veggie")
	  {
	   price = 370;
	  return price;
	  }
	  if(foodName=="choco lava cake")
	  {
	   price = 149;
	  return price;
	  }
	  if(foodName=="sprinkled fries")
	  {
	   price = 99;
	  return price;
	  }
	  if(foodName=="classic bread stix")
	  {
	   price = 109;
	  return price;
	  }
	  if(foodName=="cheese garlic bread")
	  {
	   price = 149;
	  return price;
	  }
	  if(foodName=="")
	  {
	   price = 50;
	  return price;
	  }
	  if(foodName=="creamy bread stix")
	  {
	   price = 150;
	  return price;
	  }
	  if(foodName=="zesty paneer pocket")
	  {
	   price = 119;
	  return price;
	  }
	  if(foodName=="zesty chicken pocket")
	  {
	   price = 130;
	  return price;
	  }
	  if(foodName=="jalapeno poppers")
	  {
	   price = 109;
	  return price;
	  }
	  if(foodName=="classic makhani pasta")
	  {
	   price = 179;
	  return price;
	  }
	  if(foodName=="oreo tub")
	  {
	   price = 284;
	  return price;
	  }
	  if(foodName=="desikulficup")
	  {
	   price = 57;
	  return price;
	  }
	  if(foodName=="pepsi")
	  {
	   price = 57;
	  return price;
	  }
	  if(foodName=="mirinda")
	  {
	   price = 57;
	  return price;
	  }
	  if(foodName=="7 up")
	  {
	   price = 50;
	  return price;
	  }
	  if(foodName=="momo dip")
	  {
	   price = 20;
	  return price;
	  }
	  if(foodName=="cheesy dip")
	  {
	   price = 28;
	  return price;
	  }
	  if(foodName=="mashroom pasta")
	  {
	   price = 199;
	  return price;
	  }
	  if(foodName=="tear and share non veg")
	  {
	   price = 189;
	  return price;
	  }
	  if(foodName==" Masala Rava Idli")
	  {
	   price = 110;
	  return price;
	  }
	  if(foodName=="FIT FARE")
	  {
	   price = 50;
	  return price;
	  }
	  if(foodName=="Chicken Pickle")
	  {
	   price = 400;
	  return price;
	  }
	  if(foodName=="Gongura Chicken Pickle")
	  {
	   price = 450;
	  return price;
	  }
	  if(foodName=="Yellow Dal Tadka, Bhindi Chana, Paratha Thali")
	  {
	   price = 228;
	  return price;
	  }
	  if(foodName=="Kadhai Paneer, Soya Masala Sabzi, Paratha Thali")
	  {
	   price = 259;
	  return price;
	  }
	  if(foodName=="Sabudana Khichdi")
	  {
	   price = 189;
	  return price;
	  }
	  if(foodName=="Quinoa Khichdi")
	  {
	   price = 190;
	  return price;
	  }
	  if(foodName=="ignature Sabudana Khichdi")
	  {
	   price = 179;
	  return price;
	  }
	  if(foodName=="Veg Manchurian Fried Rice Bowl")
	  {
	   price = 268;
	  return price;
	  }
	  if(foodName=="Chilli Paneer Hakka Noodles Bowl")
	  {
	   price = 290;
	  return price;
	  }
	  System.out.println("end of search");
      return price;
 }



	  

 public static double search(String foodName,int quantity){
    double price=0.0;
	System.out.println("invoked search : foodname(String), quantity( int )");
	if(foodName=="Sandwich")
	{
	price= 110.00*quantity ;
	return price;
	}
	if(foodName=="Afghani Tikka")
	{
	  price = 350*quantity;
	  return price;
	  }
	  if(foodName=="Chicken Tikka")
	  {
	  price = 360*quantity;
	  return price;
	  }
	  if(foodName=="Hariyali Kebab")
	  {
	   price = 340*quantity;
	  return price;
	  
}
if(foodName=="Margherita")
{
	   price = 239*quantity;
	  return price;
	  }
	  if(foodName=="Farmhouse")
	  {
	   price = 459*quantity;
	  return price;
	  }
	  if(foodName=="peppy paneer")
	  {
	   price = 460*quantity;
	  return price;
	  }
	 
	  if(foodName==" veggie paradise")
	  {
	   price = 459*quantity;
	  return price;
	  }
	  if(foodName==" cheese n corn")
	  {
	   price = 379*quantity;
	  return price;
	  }
	  if(foodName=="veg extravaganza ")
	  {
	   price = 549*quantity;
	  return price;
	  }
	  if(foodName==" Mexican green wave")
	  {
	   price = 459*quantity;
	  return price;
	  }
	  if(foodName=="double cheese margherita ")
	  {
	   price = 379*quantity;
	  return price;
	  }
	  if(foodName=="Chicken Lollypop")
	  {
	   price = 310*quantity;
	  return price;
	  }
	  
	  if(foodName=="fresh veggie")
	  {
	   price = 370*quantity;
	  return price;
	  }
	  if(foodName=="choco lava cake")
	  {
	   price = 149*quantity;
	  return price;
	  }
	  if(foodName=="sprinkled fries")
	  {
	   price = 99*quantity;
	  return price;
	  }
	  if(foodName=="classic bread stix")
	  {
	   price = 109*quantity;
	  return price;
	  }
	  if(foodName=="cheese garlic bread")
	  {
	   price = 149*quantity;
	  return price;
	  }
	  if(foodName=="")
	  {
	   price = 50*quantity;
	  return price;
	  }
	  if(foodName=="creamy bread stix")
	  {
	   price = 150*quantity;
	  return price;
	  }
	  if(foodName=="zesty paneer pocket")
	  {
	   price = 119*quantity;
	  return price;
	  }
	  if(foodName=="zesty chicken pocket")
	  {
	   price = 130*quantity;
	  return price;
	  }
	  if(foodName=="jalapeno poppers")
	  {
	   price = 109*quantity;
	  return price;
	  }
	  if(foodName=="classic makhani pasta")
	  {
	   price = 179*quantity;
	  return price;
	  }
	  if(foodName=="oreo tub")
	  {
	   price = 284*quantity;
	  return price;
	  }
	  if(foodName=="desikulficup")
	  {
	   price = 57*quantity;
	  return price;
	  }
	  if(foodName=="pepsi")
	  {
	   price = 57*quantity;
	  return price;
	  }
	  if(foodName=="mirinda")
	  {
	   price = 57*quantity;
	  return price;
	  }
	  if(foodName=="7 up")
	  {
	   price = 50*quantity;
	  return price;
	  }
	  if(foodName=="momo dip")
	  {
	   price = 25*quantity;
	  return price;
	  }
	  if(foodName=="cheesy dip")
	  {
	   price = 28*quantity;
	  return price;
	  }
	  if(foodName=="mashroom pasta")
	  {
	   price = 199*quantity;
	  return price;
	  }
	  if(foodName=="tear and share non veg")
	  {
	   price = 189*quantity;
	  return price;
	  }
	  if(foodName==" Masala Rava Idli")
	  {
	   price = 110*quantity;
	  return price;
	  }
	  if(foodName=="FIT FARE")
	  {
	   price = 50*quantity;
	  return price;
	  }
	  if(foodName=="Chicken Pickle")
	  {
	   price = 405*quantity;
	  return price;
	  }
	  if(foodName=="Gongura Chicken Pickle")
	  {
	   price = 450*quantity;
	  return price;
	  }
	  if(foodName=="Yellow Dal Tadka, Bhindi Chana, Paratha Thali")
	  {
	   price = 228*quantity;
	  return price;
	  }
	  if(foodName=="Kadhai Paneer, Soya Masala Sabzi, Paratha Thali")
	  {
	   price = 259*quantity;
	  return price;
	  }
	  if(foodName=="Sabudana Khichdi")
	  {
	   price = 189*quantity;
	  return price;
	  }
	  if(foodName=="Quinoa Khichdi")
	  {
	   price = 190*quantity;
	  return price;
	  }
	  if(foodName=="ignature Sabudana Khichdi")
	  {
	   price = 179*quantity;
	  return price;
	  }
	  if(foodName=="Veg Manchurian Fried Rice Bowl")
	  {
	   price = 268*quantity;
	  return price;
	  }
	  if(foodName=="Chilli Paneer Hakka Noodles Bowl")
	  {
	   price = 290*quantity;
	  return price;
	  }
	  System.out.println("end of search");
      return price;
 }
}


	  