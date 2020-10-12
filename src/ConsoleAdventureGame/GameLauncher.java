package ConsoleAdventureGame;

public class GameLauncher {
    public static Weapons[] weaponsList = new WeaponsArray().findAll();
    public static void main(String[] args) {
        System.out.println("Welcome to Adventure Game!\n" +
                "You are the Hero \"Cualli.\"\n" +
                "Enemies have invaded your peaceful village, killed most of the warriors and kidnapped the women and children.\n" +
                "You must Find the captives and free them.\nChoose your weapon:" +
                "\n");

       for(Weapons weapons : weaponsList){
           System.out.println(weapons.getWeaponChoice()+"|Strike Distance: "+weapons.getStrikeDistance()+"|Damage: "+weapons.getDamagePoint()+"|Description: "+weapons.getWeaponDescription());
       }
    }


}
