package arrays;

import java.util.Scanner;

public class RangeOfArray {

	public static void main(String[] args) {
int n ,max=0,min=1; 
		
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) 
		{
			if(max<a[i]) 
			{
				
				max=a[i];
			}
		}
		System.out.println("the maximum element"+max);
					
		for(int i=0;i<n;i++) 
		{
			if(a[i]<=min) 
			{
				
				min=a[i];
			}
		}
		System.out.println("the minimum element"+min);

	}

}