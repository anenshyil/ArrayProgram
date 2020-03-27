package ArrayPgm;

//Description : Write a Java program to calculate the average value of array elements.
//Input a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//Output   = average = 7.0

public class ArraySample {
	public static void main(String[] args) {
		
		int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]==3)
//			{
//				System.out.println(i);
//			}
//		}
//	}
//}
		
		float sum=0;
		int avg=0;
		
		for (int i = 0; i < a.length; i++) {
			
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		System.out.println(sum/a.length);
		
	}

}
