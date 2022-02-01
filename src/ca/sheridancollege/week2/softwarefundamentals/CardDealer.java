/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("Diamonds");

        //Declaration of the aceDiamonds Object
        Card aceDiamonds = new Card("Diamonds", 1);
        //assigning getters to 2 variables
        String suit = aceDiamonds.getSuit();
        int value = aceDiamonds.getValue();
        //Prints the value of my new object
        System.out.println("My cards suit is: " + suit);
        System.out.println("My cards value is: " + value);

    }
}
