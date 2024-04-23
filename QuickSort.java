package sorting;

public class QuickSort {
	
	public static int partition(int[] a, int low, int high) { // (a,0,5) // {23,65,12,76,16,98}
		int pivot=a[(low+high)/2]; // a[2]=12
		while(low<=high) { // 1<=1
			while(a[low]<pivot) { // a[1]=65 < 12
				low++;
			}
			while(a[high]>pivot) { // a[1]=65  >12
				high--; 			// 0
			}
			if(low<=high) { 		// 1<=0
				int temp=a[low]; 	// temp=23
				a[low]=a[high];		// 12
				a[high]=temp;		//23 			// {12,65,23,76,16,98}
				low++;				//1
				high--;				//1
			}
		}
		return low; // 1
	}
	
	public static void quickSort(int[] a,int low,int high) {
		int pi=partition(a,low,high); // 1
		if(low<pi-1) { // 0<1-1
			quickSort(a,low,pi-1);
		}
		if(pi<high) { // 1<5
			quickSort(a,pi,high); 	// (a,1,5)
		}
	}
	
	public static void print(int[] a) {
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		int[] a= {23,65,12,76,16,98};
		print(a);
		System.out.println();
		System.out.println("after sorting");
		quickSort(a,0,a.length-1);
		
		print(a);

	}

}
