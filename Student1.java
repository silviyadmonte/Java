class Student1
{
String name;
int age;

void setAttr(String n,int a)
{
name=n;
age=a;
}

void display()
{
System.out.println("Name is " +name + ", " + "age is " +age);

} 

public static void main(String args[])
{
Student1 s=new Student1();
Student1 s1=new Student1();
s.setAttr("Ram",32);
s1.setAttr("Shyam", 31);

s.display();
s1.display();
}
}
