class DConstructor
{  
int id;  
String name;  
//method to display the value of id and name  
void display()
{
System.out.println(id+" "+name);
}    
public static void main(String args[])
{  
//creating objects  
DConstructor s1=new DConstructor();  
DConstructor s2=new DConstructor();  
//displaying values of the object  
s1.display();  
s2.display();  
}  
}  
