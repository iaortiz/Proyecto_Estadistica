/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_proyecto;

/**
 *
 * @author Carlos Juca
 */
public class E_Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayEjemplo = {18,19, 21, 21,21, 24, 24,25,25, 28, 27, 30, 30, 33, 33, 36,37};

        Operaciones ObjOp = new Operaciones();
        int nClases = ObjOp.calcularClases(arrayEjemplo.length);
        int rango = ObjOp.calcularRango(arrayEjemplo);
        int intervalo = ObjOp.CalcularAmplitud(rango, nClases);
        int[][] table = new int[nClases][3];
        int ant = ObjOp.calcularMin(arrayEjemplo);
        for (int i = 0; i < table.length; i++) {
            table[i][0] = ant;
            table[i][1] = ant + intervalo;
            ant = table[i][1];
        }
        int[][] tableTabulada = ObjOp.Tabular(table, arrayEjemplo);
        for (int i = 0; i < tableTabulada.length; i++) {
            for (int j = 0; j < tableTabulada[0].length; j++) {
                System.out.printf("%d ", tableTabulada[i][j]);
            }
            System.out.printf("\n");
        }
    }

}
