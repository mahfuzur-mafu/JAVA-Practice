package grambangla;

public class HumanInfo {
   public String name;
   public  int age ;
    public int year;
    public String job;

    HumanInfo()
    {
        this.name=null;
        this.age=0;
        this.year=0;
        this.job=null;

    }
    HumanInfo(String name ,int age , int year,String job)

    {
        this.name =name;
        this.age=age;
        this.year=year;
        this.job= job;
    }
    public void getHuman()
    {
        System.out.println("Name : "+name+"\n"+"Age : "+age+"\n"+"DOY : "+year+"\n"+"Job : "+job);
    }
}

