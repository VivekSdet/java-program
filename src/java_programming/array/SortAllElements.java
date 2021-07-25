package java_programming.array;

public class SortAllElements {

	public static void main(String[] args) {
		
		// > for accending
		// < for desending 
		
		int a[]= {40,30,10,20,25};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		/*for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}*/

		System.out.println("max element is " + a[0]);
		System.out.println("min element is "+ a[a.length-1]);
		System.out.println("second element is " + a[1]);
		System.out.println("second element is "+ a[a.length-2]);
		
	}

}
