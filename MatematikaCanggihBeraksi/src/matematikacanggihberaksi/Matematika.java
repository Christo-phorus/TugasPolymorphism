/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikacanggihberaksi;

/**
 *
 * @author acer
 */
public class Matematika {
    //pertambahan
    void pertambahan(int a, int b){
        int hasil = a + b;
        System.out.println("Hasil pertambahan = " + hasil);
    }
    void pertambahan(int a, int b, int c){
        double hasil = a + b;
        System.out.println("Hasil pertambahan = " + hasil);
    }
    void pertambahan(double a, double b){
        double hasil = a + b;
        System.out.println("Hasil pertambahan = " + hasil);
    }
    void pertambahan(double a, double b, double c){
        double hasil = a + b + c;
        System.out.println("Hasil pertambahan = " + hasil);
    }
    
    //perkalian
    void perkalian(int a, int b){
        int hasil = a * b;
        System.out.println("Hasil perkalian = " + hasil);
    }
    void perkalian(int a, int b, int c){
        int hasil = a * b * c;
        System.out.println("Hasil perkalian = " + hasil);
    }
    void perkalian(double a, double b){
        double hasil = a * b;
        System.out.println("Hasil perkalian = " + hasil);
    }
    void perkalian(double a, double b, double c){
        double hasil = a * b * c;
        System.out.println("Hasil perkalian = " + hasil);
    }
    
    //pembagian
    void pembagian(int a, int b){
        int hasil = a / b;
        System.out.println("Hasil pembagian = " + hasil);
    }
    void pembagian(int a, int b, int c){
        int hasil = a / b / c;
        System.out.println("Hasil pembagian = " + hasil);
    }
    void pembagian(double a, double b){
        double hasil = a / b;
        System.out.println("Hasil pembagian = " + hasil);
    }
    void pembagian(double a, double b, double c){
        double hasil = a / b / c;
        System.out.println("Hasil pembagian = " + hasil);
    }
}

class MatematikaCanggih extends Matematika {
    void modulus (int a, int b){
        int hasil = a % b;
        System.out.println("Hasil modulus = " + hasil);
    }
    void modulus(int a, int b, int c){
        int hasil = a % b % c;
        System.out.println("Hasil modulus = " + hasil);
    }
    void modulus (double a, double b){
        double hasil = a % b;
        System.out.println("Hasil modulus = " + hasil);
    }
    void modulus (double a, double b, double c){
        double hasil = a % b % c;
        System.out.println("Hasil modulus = " + hasil);
    }
}
