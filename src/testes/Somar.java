/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

/**
 *
 * @author u1845853
 */
public class Somar {
    public int soma(int num1, int num2) {
        return num1 + num2;
    }
    public int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public int soma(int ... numeros) {
        int res = 0;
        for (int i = 0; i < numeros.length; i++) {
            res = res + numeros[i];            
        }
        return res;
    }
    
    public static void main(String[] args) {
      Somar somar = new Somar();
        System.out.println("Soma:" + somar.soma(4, 9, 324,234,1,2141, 21,3241) );
    }
}
