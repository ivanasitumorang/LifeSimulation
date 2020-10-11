/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifesimulation;

import lifesimulation.model.Human;
import lifesimulation.util.Helper;

/**
 *
 * @author mobiledevmac11
 */
public class LifeSimulation {

    /**
     * Bertujuan untuk mensimulasikan kehidupan manusia
     */
    public static void main(String[] args) throws InterruptedException {
       
        // todo : buat seorang manusia
        Human mike = new Human();
        Helper.print("Masukkan nama objek manusia : ");
        String objName = Helper.scanText();
        mike.setName(objName);
        
        printResult(mike);
        
        // todo : jalankan method pada Human
        //example
        Helper.print("....");
        Thread.sleep(1000L);
        mike.run();
    }
    
    private static void printResult(Human human) {
        Helper.print("Objek manusia yang akan disimulasikan adalah " + human.getName());
    }
    
}
