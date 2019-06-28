package org.lkg.java;

public class A2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 *   [*] [ ] [ ] ---> row 0
		 *   [ ] [ ] [ ] ---> row 1
		 *   [ ] [ ] [ ] ---> row 2
		 *    |   |   | 
		 *   c0   C1  C2 ---> Columns
		 *   
		 *   
		 *  This is a 3*3 Array  where we have 3 rows and 3 columns.
		 *  
		 *  Declaration : type[][] name ||  type[] name[]; || type name[][];
		 * 
		 *  eg : int[] a[] ;  ---> a is the reference variable of 2-D Array of integers.
		 *  
		 *  allocation : "new" operation for the allocation of the memory in java.
		 *  
		 *  eg: new type [3]  [4] ;   it is 3*4 array , where we have 3 rows and 4 columns  ---> 3 1-D Arrays of the size 4  i.e 3*4 array.
		 *  note: no of rows is mandatory option , but no of columns can be optional.
		 *  
		 *  [ ] -- 1-D array with Size 4  [][][][]   }
		 *  [ ] -- 1-D array with Size 4  [][][][]   }  ==> 3 * 4 Array 
		 *  [ ] -- 1-D array with Size 4  [][][][]   } 
		 *            
		 *  
		 */
		
		
		int[] d[] = new int[2][3];
		
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				d[i][j]= i+j;
			}
		}
		 
		for(int i=0;i<d.length;i++) { 
			for(int j=0;j<d[i].length;j++) {
				
				System.out.println(d[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
