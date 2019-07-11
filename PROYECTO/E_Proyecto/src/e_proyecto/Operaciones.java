/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_proyecto;

import java.lang.Math;

/**
 *
 * @author Carlos Juca
 */
public class Operaciones {
    
    public int calcularClases(int nDatos){
        int k = 0;
        int base = 2;
        int pot = 1;      
        do {
            pot*=base;
            k++;
        } while (pot<nDatos);
    return k;
    }
    public int calcularRango(int[] datos){
        int nMayor = -99999999;
        int nMenor = 999999999;
        int rango;
        for (int i = 0; i < datos.length; i++) {
            if(datos[i]<nMenor){
                nMenor = datos[i];
            }
            if (datos[i]>nMayor) {
                nMayor = datos[i];
            }
        }
        rango = nMayor - nMenor;
        return rango;
    }
        public int calcularMin(int[] datos){
        int nMenor = 999999999;
        for (int i = 0; i < datos.length; i++) {
            if(datos[i]<nMenor){
                nMenor = datos[i];
            }
        }
        return nMenor;
    }
    public int CalcularAmplitud(int rango,int k){
        return (int)Math.ceil((float)rango/k);
    }
    
    public int[][] Tabular(int[][] table,int[] arrayDatos){
        for (int i = 0; i < arrayDatos.length; i++) {
            for (int j = 0; j < table.length; j++) {
                    if(arrayDatos[i]>=table[j][0] && arrayDatos[i]<table[j][1]){
                        table[j][2]+=1;
                    }
            }
        }
        return table;
    }
}
