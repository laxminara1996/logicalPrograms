package in.laxmi;

public class SeperateEvenandOddinArray {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8,9};
	int[] a = new int[arr.length];
	int count =0;
	for(int i =0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			a[count] =arr[i];
			count++;
		}
	}
	for(int i=0;i<arr.length;i++)
    {
        if(arr[i]%2!=0)
        {
         a[count]=arr[i];
            count++;
        }
    }
	for(int i =0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	
	
	
	
	
	
	
	
	
}
}
