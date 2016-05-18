import java.util.ArrayList;
public class P1 implements PAspects
{
    private String name;
    private String type;
    private ArrayList<Integer> stats;    // [0]:hp, [1]:atk, [2]:def, [3]:spd
    private ArrayList<Attack> moveset;
    public P1() {
        name = "Arcanine";
        type = "Fire";
        stats = new ArrayList<Integer>();
        moveset = new ArrayList<Attack>();
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getStats() {
        setStats();
        return stats;
    }

    private void setStats()  {
        int hp = (int)(Math.random()*101)+250;
        int atk = (int)(Math.random()*51)+200;
        int def = (int)(Math.random()*101)+100;
        int spd = (int)(Math.random()*51)+300;
        stats.add(hp);
        stats.add(atk);
        stats.add(def);
        stats.add(spd);
    }

    private void setAttacks()    {
        moveset.add(new Attack("Flamethrower", 80, true, 3, 100, false));
        moveset.add(new Attack("Hyper Beam", 180, false, 0, 80, false));
        moveset.add(new Attack("Fire Blast", 145, true, 2, 85, false));
        moveset.add(new Attack("Will-O-Wisp", 0, true, 10, 85, false));
    }

    public ArrayList<Attack> getMoveset()   {
        setAttacks();
        return moveset;
    }
}
