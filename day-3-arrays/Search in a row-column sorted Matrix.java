/*
n = 3, m = 3, x = 62
matrix[][] = {{ 3, 30, 38},
              {36, 43, 60},
              {40, 51, 69}}
Output: 0
Explanation:
62 is not present in the matrix, 
so output is 0.

*/
class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    int i=0, j=m-1;
        while(i<n && j>=0) {
            if(matrix[i][j] == x) {
                return true;
            }
            else if(x > matrix[i][j]) {
                i++;
            }
            else {
                j--;
            }
        }
	    return false;
	} 
} 

/* 
    Time complexity = O (log n)
    Spacer complexity = O (n+m)
 */
