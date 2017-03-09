package Examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Weighted Undirected Graph
The following is a 2D Array implementation of Graph using Adjacency Matrix
Sample Input
1
5 5
0 3 3
0 4 11
1 2 15
1 4 1
2 3 20
Sample Output
0 0 0 3 11 
0 0 15 0 1 
0 15 0 20 0 
3 0 20 0 0 
11 1 0 0 0 
*/
public class WUDG {
    public static void main(String [] args) throws FileNotFoundException{
        Scanner get = new Scanner(new File("WUDG.in"));
        int t = get.nextInt();
        while(t-->0){
            int V = get.nextInt();
            int E = get.nextInt();
            int [][]G = new int[V][V];
            for(int i=0;i<V;i++){
                int from = get.nextInt();
                int to = get.nextInt();
                int weight = get.nextInt();
                G[from][to]=weight;
                G[to][from]=weight;
            }            
            for(int i=0;i<V;i++){
                for(int j=0;j<V;j++){
                    System.out.print(G[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
