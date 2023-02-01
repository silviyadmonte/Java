abstract class Gmail{
// method of abstract class
abstract void login(); 
}
class MainEx extends Gmail {
void login()
{
System.out.println("Implementation of login");
}
public static void main(String[] args) {
// create an object of Main
MainEx obj = new MainEx ();

// access method of abstract class
// using object of Main class
obj.login();
}
}