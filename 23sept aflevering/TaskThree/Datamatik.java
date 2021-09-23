public class Datamatik{

public static void main(String[] args) {
  Teacher William = new Teacher("William", 30, "Male");
  Student Martin = new Student("Martin", 28, "Male", "b team");
  Student Mads = new Student ("Mads", 26, "Male", "b team");

  System.out.println(William.name);
  System.out.println(Martin.name +" "+ Martin.datamatikerTeam);
  System.out.println(Mads.name +" " +Mads.datamatikerTeam);
}
}
