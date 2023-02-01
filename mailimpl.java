interface gmail{  
void inbox();
void spam();  
}  
class mailimpl implements gmail{  
public void inbox()
{
System.out.println("Implementation of inbox");
}  
public static void main(String args[]){  
mailimpl mi = new mailimpl();  
mi.inbox();  
 }  
}  