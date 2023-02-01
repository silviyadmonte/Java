import java.util.*;
import Volume.Cylinder;
import Volume.Sphere;
import java.util.Scanner;
public class PackageDemo
{
public static void main(String z[])
{
Cylinder obj1=new Cylinder();
Sphere obj2=new Sphere();
System.out.println("Enter Height and Radius Of the Cylinder");
Scanner s=new Scanner(System.in);
double r=s.nextDouble();
double h=s.nextDouble();
System.out.println("Enter Radius of the Sphere");
double p=s.nextDouble();
System.out.println("Volume of the Cylinder"+(obj1.volCyl(r,h)));
System.out.println("Volume of the sphere = "+(obj2.volSphere(p)));
}
}

