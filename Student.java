class Student
{
String name;
int age;

public static void main(String args[])
{
Student s=new Student();
s.name="Ram";
s.age=32;
Student s1=new Student();
s1.name="Shyam";
s1.age=31;

System.out.println("name of s is "  + s.name +  "age of s is "  + s.age);

System.out.print("name of s1 is "  + s1.name +  "age of s1 is "  + s1.age);
}
}
