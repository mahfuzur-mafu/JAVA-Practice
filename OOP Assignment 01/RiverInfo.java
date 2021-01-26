package grambangla;

public class RiverInfo {
    String name ;
    String area;
    boolean  fish;
    boolean boat;

    RiverInfo()
    {
        this.name=null;
        this.area=null;
        this.fish=false;
        this.boat=false;

    }
    RiverInfo(String name , String area, boolean fish, boolean boat)
    {
        this.name = name ;
        this.area=area;
        this.fish=fish;
        this.boat=boat;
    }
    public void getRiver ()
    {
        System.out.println("River Name : " + name + "\n" + "River Area : " + area + "\n" + "Fish Status : "+fish+"\n"+"Boat Status : "+boat);
    }
}
