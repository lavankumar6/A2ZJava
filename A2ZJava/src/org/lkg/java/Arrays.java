package org.lkg.java;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Reference Variable : A Variable that contains  the address of the other data items / objecs is called as reference variable . 
		 *  
		 *  [] ---> (object) 
		 * ref 
		 * variable
		 * 
		 *  here "new" operator is useful to allocated the memory for the objects in java. It also initializes allocated memory to default values and returns
		 *  the starting the address of the allocated memory.
		 *  
		 *  Syntax :  type ref = new type ;
		 *  
		 *  Array : It is an object that holds the elements of similar type only.
		 *  eg:
		 *  
		 *  [10][20][30][40][50]   -- Array of the integer type.
		 *  [10.0][20.2][30.4][40.5][50.6]   -- Array of the Double type.
		 *  
		 *  Types of Arrays :  1- D, 2- D and 3-D  ... etc 
		 *  
		 *  1-D ( One Dimensional array )
		 *  -----------------------------
		 *  
		 *  	[1][2][3][4][5]
		 *  	 0  1  2  3  4  -- Indices. (index)
		 *  
		 *  Declaration:    type[] varname;  or type varname[];
		 *  ------------    
		 *  			eg   int[]  a;  or int a[];  -- Here a is the reference variable.
		 *  
		 *  Allocation of the Object :
		 *  -------------------------
		 *           new type[size];
		 *           
		 *           eg: a = new int[5];
		 *           
		 *           
		 *      [] --> [0][0][0][0][0] --> Default initial Values.     
		 *      a 	    0  1  2  3  4
		 *  
		 *  
		 * 
		 */
		
		int[] a ; // Declaration of the integer array.
		
		a = new int[5]; //Allocation of the Array
		
		double[] b  = new double[5];
		
		for ( int i =0 ; i<5;i++) {
			a[i] = i+1;  // Storing the values int the array.
		}
		
		for (  int j=0 ; j<a.length;j++) {  // a.lenght gives the length of the array.
			System.out.println("Value in Array at  "+ j +"  Position is: \t"+a[j]) ;
		}
		
		for ( int i =0 ; i<5;i++) {
			b[i] = 1.0;  // Storing the values int the array.
		}
		
		for (  int j=0 ; j<b.length;j++) {  // a.lenght gives the length of the array.
			System.out.println("Value in Array at  "+ j +"  Position is: \t"+b[j]) ;
		}
		
	}

}
