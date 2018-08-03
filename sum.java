package number;
import java.util.*;
public class Checkchar 
{
    public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int N,i,sum=0;
		Scanner s= new Scanner(System.in);
		N = s.nextInt();	
		s.close();
	   for(i=1;i<=N;i++)
	   {
		   sum=sum+i;
		   System.out.println(sum);
	   }
  }	
}