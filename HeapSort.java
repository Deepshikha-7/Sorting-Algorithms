package sorting;

public class HeapSort {
	
	
	public static void sort(int[] a) {		//{3,2,6,34,7,71}
		int n=a.length;						//n=6
		for(int i=n/2-1;i>=0;i--) {			//i=1 1>=0
			heapify(a,n,i);				//(a,6,1)
		}
		for(int i=n-1;i>=0;i--) {		//
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			heapify(a,i,0);
		}
	}
	
	public static void heapify(int[] a, int n, int i) { 	// {3,2,6,34,7,71} (6,2),(a,6,3),(a,6,1)
		int largest=i;			//lragest=1
		int l=2*i+1;			//l=3
		int r=2*i+2;			//r=4
		
		if(l<n && a[l]>a[largest]) {		// l=3 < n=6 && a[3]=34>a[1]=2
			largest=l;				//largest=3
		}
		if(r<n && a[r]>a[largest]) {		// 4<6 && 7>34
			largest=r; 		//4
		}
		if(largest !=i) {			// 3 != 3
			int swap=a[i];			// 6
			a[i]=a[largest];		//34
			a[largest]=swap;		//6
			heapify(a,n,largest);	//(a,6,3)
		}
	}

	public static void print(int[] a) {
		
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a= {3,2,6,34,7,71};
		print(a);
		
		sort(a);
		System.out.println("after sorting ");
		print(a);

	}
}
