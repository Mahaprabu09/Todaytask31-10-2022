package day31102022;

public class Bubblesort {
	static void Bubblesorting(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String []args)
	{
		int arr[]={23,87,32,78,21,34,99,53,11};
		System.out.println("Before bubble sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
		System.out.println("After bubble sorting");
		Bubblesorting(arr);
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(" "+arr[j]);
		}	
	}
}
