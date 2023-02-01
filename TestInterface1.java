interface mail
{  
void login();  
}  
//Implementation: by second user  
class gmail implements mail{  
public void login(){System.out.println("gmail login implementation");}  
}  
class yahoo implements mail{  
public void login(){System.out.println("yahoo login implementation");}  
}  
//Using interface: by third user  
class TestInterface1{  
public static void main(String args[]){  
mail m=new gmail();//In real scenario, object is provided by method e.g. getDrawable()  
m.login(); 
mail m1=new yahoo();
m1.login(); 
}
}  