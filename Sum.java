import java.io.*;
class Sum
{
public static void main(String args[])throws IOException
{
int i,n;
float sum=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
System.out.print("Enter value of n:");
str=br.readLine();
n=Integer.parseInt(str);
for(i=1;i<=n;i++)
{
sum=sum+1.0f/i;
}
System.out.println("Sum="+sum);
}
}
