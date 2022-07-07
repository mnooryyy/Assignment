package practice;

import java.util.ArrayList;

public class ArrayD {

	public static void main(String[] args) 
	{
		
int []arr=new int[5];
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
arr[4]=6;
int arr2[]= {1,2,4,5,8,9,10,122};

ArrayList<String> a=new ArrayList<String>();
a.add("ajmal");
a.add("jawid");
a.add("faqeer");
a.remove(2);


System.out.println(arr[3]);
System.out.println(arr2[3]);
System.out.println(a);
System.out.println(a.get(1));

for (int i =0;i<arr.length;i++)
{
	System.out.println(arr[i]+"   "+ "number of itteration is size of array");
}
	}
	
}