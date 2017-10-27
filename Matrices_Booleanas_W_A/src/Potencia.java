/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Potencia {
    
     public double Potencia(double base, int exponente) {

        if (exponente == 0) {
            return 1;
        } else {
            return base * Potencia(base, exponente - 1);
        }

    }
}
