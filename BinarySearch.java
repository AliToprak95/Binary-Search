//ALI TOPRAK 

public class BinarySearch {
	
	static boolean found=false;
	static int counter=0;
	
	static int binsearch(int key, int[] x, int i, int j) {
		counter++;
		if(i==j) {
			return i;			
			}
		else if(key<=x[(i+j)/2]) {
			return binsearch(key, x, i , (i+j)/2);
		}
		else {
			return binsearch(key, x, ((i+j)/2)+1, j);
		}
		
	}

	public static void main(String[] args) {
		int key=11;
		int[] x=new int[10000000];
		for(int i=0;i<x.length;i++) {
			x[i]=10;
		}
		counter=0;
		int index=binsearch(key,x,0,10000000);
		if(index<x.length && x[index]==key) found=true;
		if(found==true) {
			System.out.println("Key "+key+" was found at index "+index+", after "+counter+" binary search iterations");
		}
		else {
			System.out.println("Key "+key+" not found, should be at index "+index+", after "+counter+" binary search iterations");
		}

	}

}
