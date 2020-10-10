package ConsoleAdventureGame;

public class Weapons {
    public String weaponChoice;


//constructor
    public Weapons(String weapon, String strikeDistance, String damagePoints, String description) {
        this.weaponChoice = weapon;
    }
//Getter

    public String getWeaponChoice (){
        return this.weaponChoice;


    }
//Setter
    public void setWeaponChoice(String weaponChoice) {
        this.weaponChoice = weaponChoice;
    }
}
