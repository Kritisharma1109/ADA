import java.util.Scanner;
public class Bubblesort{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of array:");
        int k=sc.nextInt();
        int[] arr= new int[k];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<k;i++){
        	int l=sc.nextInt();
        	arr[i]=l;
        }
        for(int i=0;i<k-1;i++){
        	for(int j=0;j<k-i-1;j++){
        		if(arr[j]>arr[j+1]){
	        		int temp;
	        		temp=arr[j];
	        		arr[j]=arr[j+1];
	        		arr[j+1]=temp;
        		}
        	}
        }
        System.out.println("Sorted:");
        for(int i=0;i<k;i++){
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
	}
}