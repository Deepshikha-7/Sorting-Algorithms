package sorting;

public class MergeSort {
	
	public static void mergeSort(int[] a,int f,int e) {
		if(f<e) {
			int mid=(f+e)/2;
			mergeSort(a,f,mid);
			mergeSort(a,mid+1,a.length-1);
			
			sort(a,0,mid,a.length-1);
		}
	}	
	
	
	public static void sort(int[] a,int f,int mid,int e) {
		int n1=mid-f+1;
		int n2=e-mid;
		int[] la=new int[n1];
		int[] ra=new int[n2];
		
		for(int x=0;x<n1;x++) {
			la[x]=a[x+f];
		}
		for(int x=0;x<n2;x++) {
			ra[x]=a[mid+1+x];
		}
		int i=0,j=0,k=f;
		
		while(i<n1 && j<n2) {
			if(la[i]<=ra[j]) {
				a[k]=la[i];
				i++;
				k++;
			}
			else {
				a[k]=ra[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			a[k]=la[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=ra[j];
			j++;
			k++;
		}
	}
	
	public static void print(int[] a) {
		for(int n: a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

	
	
	
	public static void main(String[] args) {		
		int[] a= {32,2,412,54,323,34,7,1,23,98,9};
		System.out.println("before sorting");
		print(a);
		mergeSort(a,0,a.length-1);
		
		System.out.println("after sorting");
		print(a);
	}
 }





