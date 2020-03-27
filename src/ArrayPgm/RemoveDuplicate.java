package ArrayPgm;

//QUESTION 3:
//------------
//Description : Write a Java program to remove duplicates from array
//      Input  a[]= {10,10,20,50,60,80,60,50}
//      Output a[]= {10,20,50,60,80}

public class RemoveDuplicate {
	public static void main(String[] args) {
		
		 int  a[]= {10,10,20,50,60,80,60,50};

		for (int i = 0; i < a.length; i++) {
			for(int j=0;j<a.length;j++)				
			{
				if(a[i]==a[j])
			System.out.println(a[j]);
			
		}
		}
}
}
