/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jefferson
 */
public class trayectorias {
    int tamaño;
    int m1[][];

    public trayectorias() {
    }
    
    
    public trayectorias(int a[][]){
        tamaño=a.length;
    }
    
    public int[][] recorrer(int a[][],int b[][]){
        m1=new int[tamaño][tamaño];
        for(int i=0;i<tamaño;i++){
            for(int j=0;j<tamaño;j++){
                if(b[i][j]==1){
                for(int k=0;k<tamaño;k++){
                    if(a[j][k]==1){
                            m1[i][k]=1;
                                    }
                    }
                }}
            }
        return m1;
    }
    
    public String imprimir(int a[][]){
        String r="";
        for(int i=0;i<tamaño;i++){
            for(int j=0;j<tamaño;j++){
                r=r+a[i][j]+"\t";
            }
            r+="\n";
        }
        return r;
    }
    
    public int buscar(String [] A, String b){
        int pos = 0;
        for(int i=0; i<A.length;i++ ){
            if(b.equals(A[i])){
                pos = i;
                break;
            }else{
                pos=-1;
            }
        }
        return pos;
    }
}
