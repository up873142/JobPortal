/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcase;
import java.util.Scanner;

/**
 *
 * @author Luke
 */
public class TestCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello Team, enter your name for a task!!");    
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        nameCheck(name);
        
    }
    
    public static void  nameCheck(String name){
       String ProbablyAValidName = name.replaceAll("\\s", "").toLowerCase();
            switch (ProbablyAValidName) {
        case "luke":
            System.out.println(name + " Try and break stuff");
            break;

        case "zee":
            System.out.println(name + " Make this program ask for your age");
            break;

        case "jenna":
            System.out.println(name + " Make this program ask for your height");
            break;

        case "hannah":
            System.out.println(name + " Make this program ask for your favourite colour");
            break;

        case "kris":
            System.out.println(name + " Make this program ask for your surname");
            break;

        default:
            System.out.println("oops name doesnt match! please use luke, zee, jenna, hannah or kris");
   }
    
}
    }
