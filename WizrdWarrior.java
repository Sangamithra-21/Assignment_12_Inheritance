package Assignment_12_Inheritance;

class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}
class Warrior extends Fighter
{
    public String toString()
    {
        return "Fighter is a Warrior";
    }

    boolean isVulnerable()
    {
        return false;
    }
    int getDamagePoints(Fighter fighter)
    {
        if(fighter.isVulnerable())
        {
            return 10;
        }
        else
        {
            return 6;
        }
    }

}
class Wizard extends Fighter
{
    boolean spell=false;
    public String toString()
    {
        return "Fighter is a Wizard";
    }

    boolean isVulnerable() {
        return !spell;
    }
    void prepareSpell()
    {
        spell=true;
    }

    int getDamagePoints(Fighter fighter)
    {
        if(spell)
        {
            return 12;
        }
        else
        {
            return 3;
        }
    }

}









