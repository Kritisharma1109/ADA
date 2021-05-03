import java.util.*;
public class sortTime{
        public static void main(String[] args){
                Random rand= new Random();
                int[] arr= new int[100000];
                for(int i=0;i<arr.length;i++){
                        arr[i]=rand.nextInt(1000);
                }
                
                Long start= System.currentTimeMillis();
                //selectionSort(arr);
                bubbleSort(arr);
                Long end= System.currentTimeMillis();
                System.out.println("Took:"+(end-start)+"ms");
                //System.out.println("Sorted:");
                //for(int i=0;i<k;i++){
                 //       System.out.print(arr[i]+" ");
                //}
                //System.out.println();
        }

        public static void selectionSort(int[] arr){
                int loc=arr[0];
                for(int i=0;i<arr.length-1;i++){
                        int min=arr[i];
                        for(int j=i+1;j<arr.length;j++){
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
        }

        public static void bubbleSort(int[] arr){
                for(int i=0;i<arr.length-1;i++){
                        for(int j=0;j<arr.length-i-1;j++){
                                if(arr[j]>arr[j+1]){
                                        int temp;
                                        temp=arr[j];
                                        arr[j]=arr[j+1];
                                        arr[j+1]=temp;
                                }
                        }
                }
        }
}