package ConsoleAdventureGame;

import util.Input;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GameLauncher extends WeaponsArray {
//    method for listing weapons
    static Weapons[] weaponsList = new WeaponsArray().findAll();
//
    public static void main(String[] args) {

//       *****input class*******
        Input UserIn = new Input();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Adventure Game!\n" +
                "You are the Hero \"Cualli.\"\n" +
                "Enemies have invaded your peaceful village, killed most of the warriors and kidnapped the women and children.\n" +
                "You must Find the captives and free them.\n\nChoose your weapon:" +
                "\n");
        for (Weapons weapons : weaponsList) {
            System.out.println("   "+weapons.getChoice() +": "+ weapons.getWeaponChoice() + " • Strike Distance: " + weapons.getStrikeDistance() + " • Damage: " + weapons.getDamagePoint() + "\n   Description: " + weapons.getWeaponDescription() +"\n");
        }
       switch(UserIn.getInt(1,3)){
           case 1:
              listWeaponByNumber("Spear");
              break;
           case 2:
               listWeaponByNumber("Knife");
               break;
           case 3:
                listWeaponByNumber("Macuahuitl");
       }

        System.out.println("\n\nYou suspect they've been taken by warriors from the next village but are not sure.\n" +
                  "would you like to do? \n 1: proceed to the next village.\n 2: follow the river to the larger villages that eventually lead to the city states?" );
//        for (AdventureGame game : weaponsList) {
//            System.out.println("   "+weapons.getChoice() +": "+ weapons.getWeaponChoice() + " • Strike Distance: " + weapons.getStrikeDistance() + " • Damage: " + weapons.getDamagePoint() + "\n   Description: " + weapons.getWeaponDescription() +"\n");
//        }
        switch(UserIn.getInt(1,2)){
            case 1:
                listWeaponByNumber("1: proceed to the next village.");
                break;
            case 2:
                listWeaponByNumber("2: follow the river to the larger villages that eventually lead to the city states");
                break;

        }
    }

    public static void listWeaponByNumber(String weaponChoice) {
        System.out.println("You've Chosen : " + weaponChoice+"\n");
        for(Weapons weapons : weaponsList) {
            if (weapons.getWeaponChoice().contains(weaponChoice)){
                System.out.println(weapons.getWeaponChoice()+". "+weapons.getWeaponDescription()+"\n"+"Damage: " + weapons.getDamagePoint()+"\n" + "Strike Distance: " + weapons.getStrikeDistance());
            }
        }

    }





}


