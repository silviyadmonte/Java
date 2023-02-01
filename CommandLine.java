import java.lang.*;

class CommandLine
{

   public static void main(String ar[])
   {

     int a,b,c;

   a=Integer.parseInt(ar[0]);
    b=Integer.parseInt(ar[1]);
   c=Integer.parseInt(ar[2]);

 if(a>b && a>c)
System.out.println("Greater is  "+a);

else if(b>c && b>a)
System.out.println("Greater is  "+b);

else
System.out.println("Greater is  "+c);
}
}
