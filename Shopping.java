import java.util.*;
import java.io.*;
class Shopping{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
Vector v=new Vector();
int i,choice=0;
System.out.println("enter 5 items");
for(i=0;i<=4;i++){
str=br.readLine();
v.addElement(str);}
while(choice!=4){
System.out.println("1.Add new item\n2.delete item\n3.display item\n4.exit\nenter your choice:");
str=br.readLine();
choice=Integer.parseInt(str);
switch(choice){
case 1:{
System.out.println("enter the name");
str=br.readLine();
v.addElement(str);
break;}
case 2:{
System.out.println("enter the name");
str=br.readLine();
v.removeElement(str);
break;}
case 3:{
System.out.println("enter the index");
str=br.readLine();
i=Integer.parseInt(str);
System.out.println("Name:"+v.elementAt(i));
break;}
case 4:
break;
default:
System.out.println("invalid choice");}
System.out.println("current list");
for(i=0;i<=v.size()-1;i++){
System.out.println(v.elementAt(i));}}}}
