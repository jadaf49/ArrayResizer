public class ArrayResizer
{
    
    public static boolean isNonZeroRow(int[][] array2D, int r)
    { 
        for (int i: array2D[r])
        {
            if (i==0) return false;
        }
        return true;
    }
    
    //public static int numNonZeroRows(int[][] array2D)
    { /* implementation not shown */ }
    
    //public static int[][] resize(int[][] array2D)
    { /* to be implemented in part (b) */ }
}