/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodorecursivomezcladirecta;

/**
 *
 * @author EFRA
 */
public class MetodoRecursivoMezclaDirecta {

    /**
     * @param args the command line arguments
     */
    int[] mezcladir(int[] arr){
        int i, j, k;
        if (arr.length>1) {
            int izq = arr.length/2;
            int der = arr.length-izq;
            int A[] = new int[izq];
            int B[] = new int[der];
            // Llenar arreglos auxiliares
            for (int l = 0; l < izq; l++) {
                A[l] = arr[l];
            }
            for (int l = izq; l < arr.length; l++) {
                B[l-izq] = arr[l];
            }
            A = mezcladir(A);
            B = mezcladir(B);
            j = 0;
            i = 0;
            k = 0;
            while (A.length!=j && B.length!=k) {                
                if (A[j]<B[k]) {
                    arr[i] = A[j];
                    j++;
                    i++;
                }else{
                    arr[i] = B[k];
                    k++;
                    i++;
                }
            }
            while (A.length!=j) {                
                arr[i] = A[j];
                i++;
                j++;
            }
            while (B.length!=k) {                
                arr[i] = B[k];
                i++;
                k++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = {9800, 3, 287 , 123, 87, 1, 0};
        MetodoRecursivoMezclaDirecta md = new MetodoRecursivoMezclaDirecta();
        md.mezcladir(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
    
    
}
