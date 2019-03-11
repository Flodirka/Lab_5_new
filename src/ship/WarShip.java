package ship;

public class WarShip extends Ship
{
    private String type;

    public WarShip(String NameShip, String Year, String Crew, String Shipyard, String Type)
    {
        super(NameShip, Year, Crew, Shipyard);
        this.type = Type;
    }

    @Override
    public String getDescription()
    {
        return "Название корабля "+getNameShip()+"\nГод спуска на воду "+getYear()+"\nЭкипаж корабля (человек) "
                +getCrew()+"\nВерфь изготовитель "+getShipyard()+"\nТип корабля "+getType();
    }

    public String getType()
    {
        return this.type = type;
    }
}
