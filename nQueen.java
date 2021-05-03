import java.util.*;
public class nQueen {

	public static boolean place(int k1,int[] X1) {
		for(int i=0;i<k1;i++) {
			if(X1[i]==X1[k1] || X1[i]-X1[k1]==i-k1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of queens");
		int n=sc.nextInt();
		int[] X= new int[n];
		int k=0;
		for(int i=0;i<n;i++) {
			X[i]=0;
		}
		while(k>=0) {
			X[k]=X[k]+1;
			while(X[k]<=n && !place(k,X)) {
				X[k]=X[k]+1;
			}
			if(X[k]<=n) {
				if(k==n-1) {
					for(int m=0;m<n;m++) {
						System.out.print(X[m]+" ");
					}
					break;
				}
				else {
					k=k+1;
					X[k]=0;
				}
			}
			else {
				k=k-1;
			}
		}
	}
}
