import graph.Graph;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MATRIX TO GRAPH CONVERTOR");
        System.out.println("Matrix: ");
        System.out.print("Enter No. of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int c = sc.nextInt();
        int[][] matrix = new int[c][r];
        System.out.println("Enter the elements of matrix one by one: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int v = matrix.length;
        Graph graph2 = new Graph(v);

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (matrix[i][j] != 0) {
                    graph2.addEdge(i, j, matrix[i][j]);
                }
            }
        }
        System.out.println("Graph representation of the given matrix");
        for ( Graph.Edge temp : graph2.edges) {
            System.out.println(temp.source + " is connected to " + temp.destination);
        }

        sc.close();
    }
}