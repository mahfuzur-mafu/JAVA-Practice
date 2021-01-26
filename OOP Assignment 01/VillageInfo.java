package grambangla;

public class VillageInfo {
    String name;
    String area;
    int people;

    VillageInfo()
    {
        this.name=null;
        this.area=null;
        this.people=0;

    }
    VillageInfo(String name, String area,int people)
    {
        this.name=name;
        this.area=area;
        this.people=people;

    }
    public void getVillage()
    {
        System.out.println("Village Name : " + name + "\n" + "Village Area : " + area + "\n" + "Village Population: "+people);
    }
}
