class TaskTwo{
  public static boolean happy = true;

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands");
   }
   System.out.println(add(1, 2));
   {
   System.out.println(upped("hello world"));
 }
 {
 System.out.println(capital("Hello world"));
}
}

public static boolean iAmHappy()
{
  // fill out what is missing here:
  if (happy){
  return true;
}
else {
  return false;
}
}
public static int add(int a, int b){

  return a+b;

}
public static String upped(String s){
return s.toUpperCase();
}

public static boolean capital(String c){

return Character.isUpperCase(c.charAt(0));
}
}
