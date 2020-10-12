package ConsoleAdventureGame;

public class Weapons {
    public String weaponChoice;
    public String strikeDistance;
    public String damagePoint;
    public String weaponDescription;


//constructor
    public Weapons(String weapon, String distance, String damagePoints, String description) {
        this.weaponChoice = weapon;
        this.strikeDistance = distance;
        this.damagePoint = damagePoints;
        this.weaponDescription = description;
    }
//Getter

    public String getWeaponChoice () {
        return this.weaponChoice;
    }
    public String getStrikeDistance () {
        return this.strikeDistance;
    }
    public String getDamagePoint () {
        return this.damagePoint;
    }
    public String getWeaponDescription(){
        return this.weaponDescription;
    }
//Setter
    public void setWeaponChoice(String weaponChoice) {
        this.weaponChoice = weaponChoice;
    }
    public void setStrikeDistance(String strikeDistance) {
        this.strikeDistance = strikeDistance;
    }
    public void  setDamagePoint(String damagePoint) {
        this.damagePoint = damagePoint;
    }
    public void setWeaponDescription(String weaponDescription){
        this.weaponDescription = weaponDescription;
    }
}

