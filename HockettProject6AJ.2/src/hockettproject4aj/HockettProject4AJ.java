/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockettproject4aj;

import javax.swing.JFrame;

   /**
     * Class Name: HockettProject4AJ
     * Class Author: Tyler Hockett
     * **************************
     * Purpose of the Class
     * acts as the main class for the program
     * initiates the gui
     * **************************
     * Date: 10/17/2017 USA
     * **************************
     * Date Changed:
     * **************************
     * Look At This!
     * 
     * **************************
     */
public class HockettProject4AJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       GUI gui = new GUI();
       gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       gui.setSize(737,651);
       gui.setVisible(true);
    }
    
}
