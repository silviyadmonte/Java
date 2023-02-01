class Student2
{
String name;
int age;

Student2(String n,int a)
{
name=n;
age=a;
}

void display()
{
System.out.print("Name is " +name + "age is" +age);

} 

public static void main(String args[])
{
Student2 s=new Student2("Silviya",30);
Student2 s1=new Student2("Ram",29);
s.display();
s1.display();

}
}
