package java_programming.array;

public class SumOfFindThreeMAxNum {

	public static void main(String[] args) {
		
		// > for accending
		// < for desending 
		
		int a[]= {40,30,10,20,25};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=0;
		for(int i=0;i<3;i++) {
			//System.out.print(a[i]+" ");
		 sum=sum+a[i];
		 System.out.println(sum);


	}

	}
}
