/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119028.rizalsihombing;

import java.util.Scanner;

/**
 *
 * @author RizalSihombing
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program kasir rock n roll haircut
 */
public class QUIZIF110119028RIZALSIHOMBING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("===Program Kasir Rock n Roll Haircut===");
        System.out.print("Customer Name : ");
        customer.setName(scanner.next());
        System.out.print("Customer Email : ");
        customer.setEmail(scanner.next());
    }
    
}