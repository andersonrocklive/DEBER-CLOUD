/**
 *
 * @author FIGO
 */
public class MatrizBooleana {
    
      public int Or(int a, int b){
        if (a==0 && b == 0)
        {
            return 0;
        }
        return 1;
    }
    
      public int And(int a, int b){
        if (a==1 && b == 1)
        {
            return 1;
        }
        return 0;
    }
    
    public int [ ][ ] junta (int [][] a,int [][] b ){
       int [][] res = new int[a.length][a[0].length];
        for (int i = 0; i < res.length; i++) {
               for (int j = 0; j < res[0].length; j++) {
                    res[i][j] = Or(a[ i ][ j ], b[ i ] [ j ] );
               }
        }
    return res;
    }
    
    public int [][] reunion (int [][] a, int [][] b){
        int [][] res = new int[a.length][a[0].length];
        for (int i = 0; i < res.length; i++) {
               for (int j = 0; j < res[0].length; j++) {
                    res[i][j] = And(a[ i ][ j ], b[ i ] [ j ] );
               }
        }
        return res;
    }       

     public int [][] productoBooleano(int [][] a, int [][] b){
        int [][] res = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                int sum= 0;
                for (int k = 0; k < a[0].length; k++) {
                    sum += a[i][k]*b[k][j];
                    if(sum == 1){
                        res[i][j]=1;
                    }
                }              
            }
        } 
 return res;
    }
}
