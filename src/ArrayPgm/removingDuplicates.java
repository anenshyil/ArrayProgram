package ArrayPgm;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.text.Utilities;

public class removingDuplicates {
	public static void main(String[] args) {
		
		int[] a={10,10,20,50,60,80,60,50,88};
		int s=a.length;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i;j<a.length;j++)
			{
			
				if(a[i]==a[j])
				{
				a[i]=a[a.length-1];
				s--;
				j--;
				}
			}
		
		}
		
		int[] b=Arrays.copyOf(a, s);
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}

}
