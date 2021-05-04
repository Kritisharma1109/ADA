import java.util.Scanner;
public class Selectionsort{
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
                int loc=arr[0];
                for(int i=0;i<k-1;i++){
                        int min=arr[i];
                        for(int j=i;j<=k-1;j++){
                                if(min>arr[j]){
                                        min=arr[j];
                                        loc=j;
                                }
                        }
                        if(min!=arr[i]){
                                int temp;
                                temp=arr[i];
                                arr[i]=arr[loc];
                                arr[loc]=temp;
                        }
                }
                System.out.println("Sorted:");
                for(int i=0;i<k;i++){
                        System.out.print(arr[i]+" ");
                }
                System.out.println();
        }
}