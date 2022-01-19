//array's of array
public class MultidimensionalArrays {

	public static void main(String[] args) {
		
		//syntax : type[][] variable-name = new type[how many array ?] [in each array how many elements?];
		
//		int[][] twoDim = new int[4][5];
		

		
//		int[][] twoDim = new int[][5]; illegal
		
//		non- rectangular
//		int[][] twoDim = new int[5][];
//		twoDim[0] = new int[1];
//		twoDim[1] = new int[2];
//		twoDim[2] = new int[3];
//		twoDim[3] = new int[4];
//		twoDim[4] = new int[5];
		
		int[][] twoDim = {{1}, {1,2}, {1,2,3},{1,2,3,4},{1,2,3,4,5}};
		
//		for ( int i = 0; i < twoDim.length ; i++ ) {
//			for ( int j = 0 ; j < twoDim[i].length; j++) {
//				System.out.print(twoDim[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for (int[] c : twoDim) {
			for (int e  : c) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

}
