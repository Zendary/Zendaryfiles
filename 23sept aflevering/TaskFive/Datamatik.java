public class Datamatik{
  static Student[] students = new Student[]{
    new Student("William", 30, "Male", "b team"),
    new Student("Martin", 28, "Male", "b team"),
    new Student ("Mads", 26, "Male", "b team"),
    new Student ("Long", 29, "Male", "b team"),
    new Student ("Steven", 28, "Male", "b team"),
    new Student ("Daniel", 25, "Male", "b team"),
    new Student ("Tim", 30, "Male", "b team"),
    new Student ("Peter", 26, "Male", "b team"),
    new Student ("Casper", 24, "Male", "b team"),
    new Student ("Bo", 35, "Male", "b team")
  };

public static void main(String[] args) {

  studentName(students, 1);
  studentS(students, "Martin");
}
public static void studentName(Student[] sName, int sNum){
  System.out.println(sName[sNum-1].name);

}
public static void studentS(Student[] sName, String sText){
  for (int i=0; i<sName.length; i++){
  sText.equals(sName[i].name);
  System.out.println(sName[i].name);
}
}

}
