import ship.*;

public class Main
{
    public static void main (String [] args)
    {
        Ship WarShip = new WarShip("Арктика","2018","30","Адмиралтейские верфи","Тральщик");
        System.out.println(WarShip.getDescription());
    }
}
