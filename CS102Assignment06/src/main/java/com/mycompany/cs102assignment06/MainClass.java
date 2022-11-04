/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cs102assignment06;

/**
 *
 * @author jehuv
 */
public class MainClass {

    public static void main(String[] args) {
        System.out.println("There are " + WordTracker.countUnique("C:\\Users\\jehuv\\Documents\\NetBeansProjects\\CS102Assignment06\\CS102Assignment06\\src\\main\\java\\com\\mycompany\\cs102assignment06\\happy.txt") + " unique words in the song.");
        System.out.println("The word 'happy' appears " + WordTracker.countWord("happy", "C:\\Users\\jehuv\\Documents\\NetBeansProjects\\CS102Assignment06\\CS102Assignment06\\src\\main\\java\\com\\mycompany\\cs102assignment06\\happy.txt") + " times in the song.");
    }
}
