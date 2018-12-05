/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio16;

/**
 *
 * @author Luis Guilherme
 */
public class UsaQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado(5);
        Quadrado quadrado2 = new Quadrado(10);
        Quadrado quadrado3 = new Quadrado(2);
        System.out.println("A área e o perímetro do quadrado 1 são respectivamente: " + quadrado1.calcularArea() + " , " + quadrado1.calcularPerimetro());
        System.out.println("A área e o perímetro do quadrado 2 são respectivamente: " + quadrado2.calcularArea() + " , " + quadrado2.calcularPerimetro());
        System.out.println("A área e o perímetro do quadrado 3 são respectivamente: " + quadrado3.calcularArea() + " , " + quadrado3.calcularPerimetro());
    }
    
}
