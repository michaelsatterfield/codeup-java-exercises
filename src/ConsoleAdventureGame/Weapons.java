package ConsoleAdventureGame;

public class Weapons extends AdventureGame {
    public String id;
    public String weaponChoice;
    public String strikeDistance;
    public String damagePoint;
    public String weaponDescription;


//constructor
    public Weapons(String _id, String weapon, String distance, String damagePoints, String description) {
        this.id = _id;
        this.weaponChoice = weapon;
        this.strikeDistance = distance;
        this.damagePoint = damagePoints;
        this.weaponDescription = description;
    }
//Getter
    public String getChoice () {
        return this.id;
    }
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
    public void setChoice(String id) {
        this.id = id;
    }
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

