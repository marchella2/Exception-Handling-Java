/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

/**
 *
 * @author march
 */
public class BagiNol3 {
    public static void main(String[] args){
        System.out.println("Sebelum pembagian");
        try{
            System.out.println(5/0);
        }catch(Throwable t){
            System.err.println("Pesan kesalahan : ");
            System.err.println(t.getMessage());
        }
        System.err.println("Sesudah pembagian");
    }
}
