public class Attack
{
    private String name;
    private int pow;
    private boolean status;
    private int acc;
    private int chance;
    private boolean flinch;
    public Attack(String name, int pow, boolean status, int chance, int acc, boolean flinch) {
        this.name = name;
        this.pow = pow;
        this.chance = chance;
        this.acc = acc;
        this.flinch = flinch;
    }
    
    public String toString()    {
        return name;
    }
    
    public String getName() {
        return name;
    }

    public int getPow() {
        return pow;
    }

    public boolean getStatus()  {
        int x = (int)(Math.random()*11);
        if(status && x <= chance)  {
            return true;
        }   else    {
            return false;
        }
    }

    public boolean getAcc() {
        boolean hit;
        int x = (int)(Math.random()*101);
        if(x < acc) 
            hit = true; 
        else    
            hit = false;        
        return hit;
    }
    
    public boolean getFlinch()  {
        int x = (int)(Math.random()*101);
        if(x > 80 && flinch)    
            return true;
        else
            return false;
    }
}
