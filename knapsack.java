import java.util.*;
public class knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of items:");
        int num=sc.nextInt();
        float[] benefit= new float[num];
		float[] weight= new float[num];
        System.out.println("Enter the weight of items:");
        for(int i=0;i<num;i++){
                weight[i]=sc.nextInt();
        }
        System.out.println("Enter the benefit associated with the items:");
        for(int i=0;i<num;i++){
                benefit[i]=sc.nextInt();
        }
		float[] value= new float[weight.length];
		System.out.println("Enter the maximum capacity:");
		float W= sc.nextInt();
		float[] x= new float[weight.length];  //ratio array
		for(int i=0;i<weight.length;i++) {
			x[i]=0;
			value[i]= benefit[i]/weight[i];
		}
		int k= value.length;
		for(int i=0;i<k-1;i++){              //sorting
        	for(int j=0;j<k-i-1;j++){
        		if(value[j]>value[j+1]){
	        		float temp;
	        		temp=value[j];
	        		value[j]=value[j+1];
	        		value[j+1]=temp;
	        		temp=weight[j];
	        		weight[j]=weight[j+1];
	        		weight[j+1]=temp;
	        		temp=benefit[j];
	        		benefit[j]=benefit[j+1];
	        		benefit[j+1]=temp;
        		}
        	}
        }
		float w=0;
		while(w<W) {
			for(int i=0;i<weight.length;i++) {
				if(Math.min(weight[k-i-1],W-w)== weight[k-i-1]) {
					x[k-i-1]=1;
				}
				else {
					x[k-i-1]=(W-w)/weight[k-i-1];
				}
				w= w+Math.min(weight[k-i-1],W-w);
			}
		}
		float profit=0;
		for(int i=0;i<x.length;i++) {
			profit= profit+ benefit[i]*x[i];
		}
		System.out.println("Total Profit: "+profit);
	}

}
