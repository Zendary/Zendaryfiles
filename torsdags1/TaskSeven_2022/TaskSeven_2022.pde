int input = -24;

for (int i=-40; i<=20; i++){  //tæller 
  if (i==6){    //når i er 6, skrives der six
    println("six");
  }else if (i==input/2){
    println("HALF!");       //når i er det halve af input skrives HALF!
  }else {
    println(i);         //der printes alle tal gennem vores tæller
  }
}
