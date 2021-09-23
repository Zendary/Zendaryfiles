public class TaskOne{

  public static void main(String[] args){
    System.out.println();

    String name ="Martin";
    int age = 28;

    DoSomething("This is a String");
    DoSomething(name,age);

  }

  public static void DoSomething(String string){

    System.out.println(string);
  }
  public static void DoSomething(String name, int age){

    System.out.println("My name is " + name + " I am " + age + " years old");
  }

}
