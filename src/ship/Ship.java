package ship;
public abstract class Ship
{
    private String NameShip;
    private String Year;
    private String Crew;
    private String Shipyard;

    public Ship (String NameShip, String Year, String Crew, String Shipyard)
    {
        this.NameShip = NameShip;
        this.Year = Year;
        this.Crew = Crew;
        this.Shipyard = Shipyard;
    }

    public abstract String getDescription();

    public String getNameShip(){return this.NameShip;}

    public String getYear(){return this.Year;}

    public String getCrew(){return this.Crew;}

    public String getShipyard(){return this.Shipyard;}
}
