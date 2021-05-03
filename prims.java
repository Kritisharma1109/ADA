
public class prims {

	public static void main(String[] args) {
		int[] vertex= {0,1,2,3,4};
		int[][] graph= {{100,9,5,2,100},{9,100,100,6,5},{5,100,100,4,5},{2,6,4,100,4},{100,5,5,4,100}};
		int[] tv= new int[5];
		int tvc=1;
		int min=100;
		int v=0;
		int v1=0;
		tv[0]=4;
		int total=0;
		while(tvc<5) {
			min= graph[tv[0]][0];
			for(int i=0;i<tvc;i++) {
				for(int j=0;j<5;j++) {
					if(min>graph[tv[i]][j]) {
						v=j;    
						v1=tv[i];
						min=graph[tv[i]][j];
					}
				}
			}
			total=total+min;  
			tvc++; 
			tv[tvc-1]=vertex[v];
			System.out.println(vertex[v]);
			graph[v][v1]= 100;
			graph[v1][v]= 100;
		}
		System.out.println("Minimum Spanning tree:");
		for(int i=0;i<tv.length;i++) {
			System.out.print(tv[i]+" ");
		}
		System.out.println();
		System.out.println("Total: "+total);
	}

}
