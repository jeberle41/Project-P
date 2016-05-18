import java.util.*;
public class Main
{
    public static void main()   {
        /**
        Scanner reader = new Scanner(System.in);
        P1 p1 = new P1();
        boolean estatus = false;
        boolean pstatus = false;
        System.out.println("Name: " + p1.getName());
        System.out.println("Type: " + p1.getType());
        System.out.println(p1.getMoveset());
        System.out.println("Enter index value of desired attack");
        int ind = reader.nextInt();
        int dmg = getDMG(p1.getStats().get(1), p1.getMoveset().get(ind).getPow(), 200);
        if(p1.getMoveset().get(ind).getAcc())   {
            System.out.println("DMG: " + dmg); 
        }   else    {
            System.out.println("Your attack missed!");
        }
        if(p1.getMoveset().get(ind).getStatus())  {
            System.out.println("You infliced a status condition!");
            estatus = true;
        }
        */
    }

    public static int getDMG(int atk, int pow, int def)  {  //very basic dmg calculator
        if(pow != 0)    {
            int dmg = (atk + pow) - def;
            int mod = (int)(Math.random()*30)+1;
            int x = (int)(Math.random()*101);
            if(x >= 50)
                dmg += mod;
            else
                dmg -= mod;
            return dmg;
        }   else    {   
            return 0;
        }
    }
}
