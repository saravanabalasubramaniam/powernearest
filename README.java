import java.io.*;
import java.util.*;
class Powerofnumber
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int num=a;
	int flag=0;
	while(num>1)
	{
		if(num%2==0)
		{  	
		}
		else
		{
			flag=1;
		}
	num=num/2;	
	}
        if(flag!=1)
	{
            System.out.println(a*2);
	}
  }
}
