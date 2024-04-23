package sorting;

public class InsertionSort {

	public static void main(String[] args) {
//		int[] a= {4,2,1,6,3,9,10};
//		int temp,j;
//		for(int i=1;i<a.length;i++) {
//			temp=a[i];
//			j=i;
//			while(j>0 && a[j-1]>temp) {
//				a[j]=a[j-1];
//				j--;
//			}
//			a[j]=temp;
//		}
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+ " ");
//		}
		
		int[] a= {13,2,6,4,8,3};
		int temp,j;
		for(int i=1;i<a.length;i++) { //i=3
			temp=a[i];					//temp=4
			j=i;						//j=3
			while(j>0 && a[j-1]>temp) {	//j=1	// 1>0 && 2>4
				a[j]=a[j-1]; // a[2]=6
				j--; //j=1
				
			}
			a[j]=temp; //a[0]=2	, a[1]=6, a[1]=4			// 2,4,6,13,8,3
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
