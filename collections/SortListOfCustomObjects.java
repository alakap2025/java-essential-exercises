class Student
{
  String name;
  int marks;

  Student(String name, int marks)
  {
    this.name = name;
    this.marks = marks;
  }

  public String toString()
  {
    return name + "_" +marks;
  }
}



/*
*It sorts the list first by each student's marks and, if those are equal, by their name.
 */
public class Solution{
  public static void main(String args[])
  {
   List<Student> list = new ArrayList<>();
   list.add(new Student("alaka", 95));
   list.add(new Student("baby", 97));
   list.add(new Student("madhvi", 87));
   list.add(new Student("mumu", 87));

   list.sort(Comparator
   .comparingInt((Student s) -> s.marks)
   .thenComparing(s -> s.name));

   System.out.println(list);

  }

}
