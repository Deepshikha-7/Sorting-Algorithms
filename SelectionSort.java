package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		//sorting integers
		int[] a= {1,5,2,13,53,24,25};
		int min;int temp=0;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		} 
		
		//sorting string
//		String[] a= {"annu","mannu","deepu","shivrani","loke","suhani"};
//		String temp; int min;
//		for(int i=0;i<a.length;i++) {
//			min=i;
//			for(int j=i+1;j<a.length;j++) {
//				if(a[j].compareTo(a[min]) <0) {
//					min=j;
//				}
//			}
//			temp=a[i];
//			a[i]=a[min];
//			a[min]=temp;
//		}
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
	}

}
