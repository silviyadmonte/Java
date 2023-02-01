import java.io.*;
class Search
{
 public static void main(String arg[])throws IOException
 {
  int n,i,search;
  String str;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter the no. of element:");
  str=br.readLine();
  n=Integer.parseInt(str);
  int a[]=new int[n];
  for(i=0;i<=n-1;i++)
  { 
   System.out.print("Enter the no.:");
   str=br.readLine();
   a[i]=Integer.parseInt(str);
  }
  System.out.print("Enter the no. to be searched:");
  str=br.readLine();
  search=Integer.parseInt(str);
  for(i=0;i<=n-1;i++)
  {
   if(search==a[i])
   break;
  }
  if(i==n)
  System.out.println("No. not found");
  else
  System.out.println("Index=" +i);
 }
}

