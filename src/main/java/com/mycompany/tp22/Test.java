/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp22;

/**
 *
 * @author PersoPc
 */
public class Test {
    public static void main(String[] args) {
        Livre livre1 = new Livre(457, "The Power", "Mark", 412);
        System.out.println("id: " + livre1.getId() + " le livre est: " + livre1.getTitre() + " écrit par " + livre1.getAuteur() + " et son prix est " + livre1.getPrix());
    }
}
