package ConsoleAdventureGame;

import util.Input;

import java.util.Scanner;

public class GameLauncher {
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


