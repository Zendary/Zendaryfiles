void setup() {
  MethodOne(); 
  MethodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  
  if (i > max)
  {
    String output = "i is greater than "+max+".";   
  
  
  println(output);
  }
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
void MethodTwo() 
{
  int weekDay = 0; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  
  if (weekDay < 5)
  {
    weekend = false;
  }
  else 
  {
    weekend = true;
  }
  if(weekDay==0){
  println("it's monday");
  }
  else if(weekDay==1) {
  println("it's thuesday");
  }
  else if(weekDay==2) {
  println("it's wednessday");
  }
  else if(weekDay==3) {
  println("it's thursday");
  }
  else if(weekDay==4) {
  println("it's friday");
  }
  else if(weekDay==5) {
  println("it's saturday");
  }
  else {
  println("its sunday");
  }
  println("is it weekend? " +weekend);
  // Print the name of the weekday here: 
  
    
    
  // Print if it is weekend here:
  
}
