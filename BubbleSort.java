package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// sorting integer values
		 int[] a= {34,21,9,45,28,5,55};
		int temp;
		//int[] a= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++) {
			int flag=0;
			for(int j=0;j<a.length-1-i;j++) {  		// faster than below
			//for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}	

		// for character sorting
//		 char[] a= {'f','s','a','e','c' };
//		char temp;
//		
//		for(int i=0;i<a.length;i++) {
//			int flag=0;
//			for(int j=0;j<a.length-1;j++) {
//				if(a[j]>a[j+1] ) {
//					temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//					flag=1;
//				}
//			}
//			if(flag==0) {
//				break;
//			}
//		}
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
		
		//for sorting strings 
		/*String[] a= {"hello", "chunna", "deepu","anu", "loke", "m"};
		String temp;
		for(int i=0;i<a.length;i++) {
		int flag=0;
			for(int j=0;j<a.length-1;j++) {
				if(a[j].compareToIgnoreCase(a[j+1])>0) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0){
			break;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}*/
	}

}
