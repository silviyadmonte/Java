import java.util.*;
class Vowel
{
public static void main(String z[])
{
Scanner s=new Scanner(System.in);
String st;
System.out.println("enter a string");
st=s.nextLine();
int n=st.length();
char c[]=new char[n];
c=st.toCharArray();
int vowel=0,consonent=0,blank=0,digit=0;
for(int i=0;i<n;i++)
{
if(c[i]>='0' && c[i]<='9')
{
digit++;
}
else if(c[i]==' ')
blank++;

else if((c[i]>='A' && c[i]<='Z')||(c[i]>='a' &&c[i]<='z'))
{
if(c[i]=='a' ||c[i]=='e' ||c[i]=='i' ||c[i]=='o' ||c[i]=='u' ||c[i]=='A' ||c[i]=='E' ||c[i]=='I'  
||c[i]=='O' ||c[i]=='U' )
vowel++;
else consonent++;
}
}
System.out.println(" blank space:" +blank+" \ndigits are:"+digit+" \nvowels are:"+vowel +"\nconsonent are:"+consonent);
}
}
