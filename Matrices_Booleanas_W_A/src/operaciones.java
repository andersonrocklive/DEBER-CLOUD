

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class operaciones {

    private String[] U;
    private String[] A;
    private String[] B;

    private int[] fa;
    private int[] fb;
    private int[] fu;
    private int[] fr;
    private int nu, na, nb;

    public operaciones(String U, String A, String B) {
        this.U = U.split(","); // Separa los elementos del venctor en cadenas 
        this.A = A.split(",");
        this.B = B.split(",");

        nu = this.U.length; // para cojer el numero de posiciones del conjunto universo
        na = this.A.length;
        nb = this.B.length;

        fu = new int[nu];// PaRA Q LA funcion caracteristica tenga los mismos numeros de elemntos q el vector universo
        fa = new int[nu];
        fb = new int[nu];
        fr = new int[nu];
    }

    public operaciones() {
    }

    public void funcarA() {
        for (int i = 0; i < na; i++) {      // llena la funcion caracteristica de A
            for (int j = 0; j < nu; j++) {
                if (A[i].equals(U[j])) {
                    fa[j] = 1;
                    break;
                }
            }
        }
    }

    public void funcarB() {
        for (int i = 0; i < nb; i++) {      // llena la funcion caracteristica de B
            for (int j = 0; j < nu; j++) {
                if (B[i].equals(U[j])) {
                    fb[j] = 1;
                    break;
                }
            }
        }
    }

    public void funcarU() {
        for (int i = 0; i < nu; i++) {      // llena la funcion caracteristica de U
            fu[i]=1;
        }
    }
    
    public int [] Union ( int [] A, int [] B ){
        for(int i =0; i< nu; i++){
            fr[i] = A[i]+B[i]-(A[i]*B[i]); 
        }
        return fr;
    }
    public int [] Interseccion (int [] A, int [] B){
        for(int i =0; i< nu; i++){
            fr[i] = A[i]*B[i]; 
        }
        return fr;
    }
    
    public int [] diferenciaA(int [] A, int [] B){
        for(int i = 0; i<nu;i++){
            fr[i]= A[i]-(A[i]*B[i]);
        }
        return fr;
    }
    
    public int [] diferenciaB(int [] A, int [] B){
        for(int i = 0; i<nu;i++){
            fr[i]= B[i]-(B[i]*A[i]);
        }
        return fr;
    }
    
    public int [] diferenciaSimetrica(int [] A, int [] B){
        for(int i = 0; i<nu;i++){
            fr[i]= A[i]+B[i]-(2*(A[i]*B[i]));
        }
        return fr;
    }
    
    
    public int [] ComplementoA(int [] A, int [] B){
        for(int i = 0; i<nu;i++){
            fr[i]= A[i]-B[i];
        }
        return fr;
    }
    public int [] ComplementoB(int [] A, int [] B){
        for(int i = 0; i<nu;i++){
            fr[i]= A[i]-B[i];
        }
        return fr;
    }
    
    public String respuesta (int [] A){
        String resp ="";
        for(int i=0; i < nu ;i++ ){
            if ( A[i]==1){
               resp+= U[i] + ",";
            }
        }
        return resp;
    }

    /**
     * @return the U
     */
    public String[] getU() {
        return U;
    }

    /**
     * @param U the U to set
     */
    public void setU(String[] U) {
        this.U = U;
    }

    /**
     * @return the A
     */
    public String[] getA() {
        return A;
    }

    /**
     * @param A the A to set
     */
    public void setA(String[] A) {
        this.A = A;
    }

    /**
     * @return the B
     */
    public String[] getB() {
        return B;
    }

    /**
     * @param B the B to set
     */
    public void setB(String[] B) {
        this.B = B;
    }

    /**
     * @return the fa
     */
    public int[] getFa() {
        return fa;
    }

    /**
     * @param fa the fa to set
     */
    public void setFa(int[] fa) {
        this.fa = fa;
    }

    /**
     * @return the fb
     */
    public int[] getFb() {
        return fb;
    }

    /**
     * @param fb the fb to set
     */
    public void setFb(int[] fb) {
        this.fb = fb;
    }

    /**
     * @return the fu
     */
    public int[] getFu() {
        return fu;
    }

    /**
     * @param fu the fu to set
     */
    public void setFu(int[] fu) {
        this.fu = fu;
    }

    /**
     * @return the fr
     */
    public int[] getFr() {
        return fr;
    }

    /**
     * @param fr the fr to set
     */
    public void setFr(int[] fr) {
        this.fr = fr;
    }

    /**
     * @return the nu
     */
    public int getNu() {
        return nu;
    }

    /**
     * @param nu the nu to set
     */
    public void setNu(int nu) {
        this.nu = nu;
    }

    /**
     * @return the na
     */
    public int getNa() {
        return na;
    }

    /**
     * @param na the na to set
     */
    public void setNa(int na) {
        this.na = na;
    }

    /**
     * @return the nb
     */
    public int getNb() {
        return nb;
    }

    /**
     * @param nb the nb to set
     */
    public void setNb(int nb) {
        this.nb = nb;
    }
    
}
