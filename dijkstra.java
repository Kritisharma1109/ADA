
public class dijkstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vertex= {0,1,2,3,4};
		int[][] graph= {{100,3,100,100,5},{100,100,8,5,3},{100,100,100,100,100},{100,100,2,100,100},{100,100,100,4,100}};
		int[] dist= {0,100,100,100,100};
		int i=0;
		int tvc=1;
		while(tvc<5)  {
			for(int j=0;j<vertex.length;j++) {
				if(dist[j]>graph[i][j]+dist[i]) {
					dist[j]=graph[i][j]+dist[i];
				}
			}
			tvc++;
			i++;
		}
		System.out.println("Shortest path (distance from source):");
		System.out.println("a: "+dist[0]);
		System.out.println("b: "+dist[1]);
		System.out.println("c: "+dist[2]);
		System.out.println("d: "+dist[3]);
		System.out.println("e: "+dist[4]);
	}

}
