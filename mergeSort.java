import java.util.*;
public class mergeSort{
        public static void main(String[] args){
                Random rand= new Random();
                int[] arr= new int[10000];
                for(int i=0;i<arr.length;i++){
                        arr[i]=rand.nextInt(1000);
                }
                //for(int i=0;i<arr.length;i++){
                //       System.out.print(arr[i]+" ");
                //}
                System.out.println();
                Long start= System.currentTimeMillis();
                mergeS(arr,0,arr.length-1);
                Long end= System.currentTimeMillis();
                System.out.println("Random Took:"+(end-start)+"ms");
                System.out.println("Sorted:");
                for(int i=0;i<50;i++){
                       System.out.print(arr[i]+" ");
                }
                assen(arr);
                des(arr);
                same();
        }

        public static void assen(int[] arr){
            Long start= System.currentTimeMillis();
            mergeS(arr,0,arr.length-1);
            Long end= System.currentTimeMillis();
            System.out.println();
            System.out.println("Assen Took:"+(end-start)+"ms");
            System.out.println("Sorted:");
            for(int i=0;i<50;i++){
                   System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        public static void des(int[] arr){
            Long start= System.currentTimeMillis();
            mergeS(arr,0,arr.length-1);
            Long end= System.currentTimeMillis();
            System.out.println();
            System.out.println("Desc Took:"+(end-start)+"ms");
            System.out.println("Sorted:");
            for(int i=arr.length-1;i>=9500;i--){
                   System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        public static void same(){
            int[] arr3= new int[1000];
            for(int i=0;i<1000;i++){
                    arr3[i]=2;
            }
            Long start= System.currentTimeMillis();
            mergeS(arr3,0,arr3.length-1);
            Long end= System.currentTimeMillis();
            System.out.println();
            System.out.println("Same Took:"+(end-start)+"ms");
            System.out.println("Sorted:");
            for(int i=0;i<50;i++){
                   System.out.print(arr3[i]+" ");
            }
            System.out.println();
        }

        public static void mergeS(int arr[], int l, int r){
            if (l < r){
                int m = (l + r) / 2;
                mergeS(arr, l, m);
                mergeS(arr, m + 1, r);
                merge(arr, l, m, r);
            }
        }
  
       public static void merge(int arr[], int l, int m, int r){
            int s1 = m - l + 1;  
            int s2 = r - m;      
     
            int arr1[] = new int[s1]; 
            int arr2[] = new int[s2]; 
     
            for (int i = 0; i < s1; ++i) 
                arr1[i] = arr[l + i];
            for (int j = 0; j < s2; ++j) 
                arr2[j] = arr[m + 1 + j];
     
            int i = 0, j = 0;
            int k = l;
            while (i < s1 && j < s2){
                if (arr1[i] <= arr2[j]){
                    arr[k] = arr1[i];
                    i++;
                }
                else{
                    arr[k] = arr2[j];
                    j++;
                }
                k++;
            }
            while (i < s1){    
                arr[k] = arr1[i];
                i++;
                k++;
            }
            while (j < s2){     
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }   
}
