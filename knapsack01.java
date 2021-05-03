import java.util.Scanner;

public class knapsack01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of items:");
        int num=sc.nextInt();
        int[] bi= new int[num];
		int[] wi= new int[num];
        System.out.println("Enter the weight of items:");
        for(int i=0;i<num;i++){
                wi[i]=sc.nextInt();
        }
        System.out.println("Enter the benefit associated with the items:");
        for(int i=0;i<num;i++){
                bi[i]=sc.nextInt();
        }
		System.out.println("Enter the maximum capacity:");
		int W= sc.nextInt();
		int[][] profit=new int[num+1][W+1];
		int[] A= new int[W+1];
		int[] B= new int[W+1];
		for(int i=0;i<=W;i++) {
			B[i]=0;
		}
		for(int k=0;k<num;k++) {
			for(int m=0;m<=W;m++) {
				A[m]=B[m];
			}
			for(int w=wi[k];w<=W;w++) {
				if(A[w-wi[k]]+bi[k]>A[w]) {
					B[w]=A[w-wi[k]]+bi[k];
				}
			}
			for(int m=0;m<=W;m++) {
				profit[k+1][m]=B[m];
			}
		}
		System.out.println();
		System.out.println("Profit array: ");
		for(int i=0;i<=num;i++) {
			for(int j=0;j<=W;j++) {
				System.out.print(profit[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.println("Total profit:"+profit[num][W]);
		int i=num;
		int k=W;
		int weight=0;
		int total=0;
		while(i>0 && k>0) {
			if(profit[i][k]!= profit[i-1][k]) {
				System.out.println("Item added:"+i);
				weight=weight+wi[i-1];
				total=total+bi[i-1];
				k=k-wi[i-1];
				i=i-1;
			}
			else {
				i=i-1;
			}
		}
		System.out.println("Total weight:"+weight);
		System.out.println("Total profit:"+total);
	}

}
