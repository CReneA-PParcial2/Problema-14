/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg14;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TABLA DE 7X7
        int [][] arreglo = new int [7][7];
        llenarTabla(arreglo);
    }
    
    //LLENADO AUTOMATICO DE LA TABLA QUE SE DESPLEGARA
    public static void llenarTabla(int [][]a){
        int x, y, z = 0;
        for (x=0; x<7; x++){
            for(y=0; y<7; y++){
                if(x==y){
                    z=1;
                }else{
                    z=0;
                }
                System.out.print(z + "\t");
            }
            System.out.print("\n");
        }
    }
    
}
