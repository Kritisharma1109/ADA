import java.util.*;
public class quicksort {
	public static int loc=0;
	public static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand= new Random();
        int[] arr= new int[10000];
        for(int i=0;i<arr.length;i++){
                arr[i]=rand.nextInt(10000);
        }
        System.out.println();
        System.out.println("Random:");
        Long start= System.currentTimeMillis();
        quick_sort(arr,0,arr.length-1);
        Long end= System.currentTimeMillis();
        System.out.println("Took:"+(end-start)+"ms");
        System.out.println("Recursive call to quick sort: "+count);
        System.out.println("Sorted:");
        for(int i=0;i<1000;i++){
               System.out.print(arr[i]+" ");
        }
        System.out.println();
        ascending();
        System.out.println();
        descending();
        System.out.println();
        same();
	}
	
	
	
	public static void ascending() {
		int[] arr3= new int[10000];
        for(int i=0;i<arr3.length;i++){
                arr3[i]=i+1;
        }
        count=0;
        System.out.println();
        System.out.println("Ascending:");
        Long start= System.currentTimeMillis();
        quick_sort(arr3,0,arr3.length-1);
        Long end= System.currentTimeMillis();
        System.out.println("Took:"+(end-start)+"ms");
        System.out.println("Recursive call to quick sort: "+count);
        System.out.println("Sorted:");
        for(int i=0;i<1000;i++){
               System.out.print(arr3[i]+" ");
        }
	}
	
	public static void descending() {
		System.out.println();
        System.out.println("Descending:");
		int[] arr4= new int[10000];
		int k=0;
        for(int i=arr4.length;i>0;i--){
                arr4[k]=i;
                k=k+1;
        }
        count=0;
        Long start= System.currentTimeMillis();
        quick_sort(arr4,0,arr4.length-1);
        Long end= System.currentTimeMillis();
        System.out.println("Took:"+(end-start)+"ms");
        System.out.println("Recursive call to quick sort: "+count);
        System.out.println("Sorted:");
        for(int i=0;i<1000;i++){
               System.out.print(arr4[i]+" ");
        }
	}
	
	public static void same() {
		int[] arr5= new int[10000];
        for(int i=0;i<arr5.length;i++){
                arr5[i]=60;
        }
        count=0;
        System.out.println();
        System.out.println("Same:");
        Long start= System.currentTimeMillis();
        quick_sort(arr5,0,arr5.length-1);
        Long end= System.currentTimeMillis();
        System.out.println("Took:"+(end-start)+"ms");
        System.out.println("Recursive call to quick sort: "+count);
        System.out.println("Sorted:");
        for(int i=0;i<1000;i++){
               System.out.print(arr5[i]+" ");
        }
	}
	
	public static void quick_sort(int[] arr1,int beg,int end){
		count=count+1;
        if(beg<end){
                partition(arr1,beg,end);
                quick_sort(arr1,beg,loc-1);
                quick_sort(arr1,loc+1,end);
        }
	}
	public static void partition(int[] arr2,int l,int r){
        loc=l;
        int flag=0;
        while(flag==0){
                while(arr2[loc]<=arr2[r] && loc!=r){
                        r=r-1;
                }
                if(loc==r){
                        flag=1;
                }
                else if(arr2[loc]>arr2[r]){
                        int temp=arr2[loc];
                        arr2[loc]=arr2[r];
                        arr2[r]=temp;
                        loc=r;
                }
                if(flag==0){
                        while(arr2[loc]>=arr2[l] && loc!=l){
                                l=l+1;
                        }
                        if(loc==l){
                                flag=1;
                        }
                        else if(arr2[loc]<arr2[l]){
                                int temp1=arr2[loc];
                                arr2[loc]=arr2[l];
                                arr2[l]=temp1;
                                loc=l;
                        }
                }
        }
	}
}
