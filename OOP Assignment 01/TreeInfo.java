package grambangla;

public class TreeInfo {
   public  String name ;
   public  int age;
    public String height;

    TreeInfo()
    {
        this.name= null;
        this.age=0;
        this.height=null;

    }
    TreeInfo(String name ,int age , String height)
    {
        this.name=name;
        this.age=age;
        this.height=height;

    }

public void getTree()
{
    System.out.println("Tree Name : "+name+"\n"+"Tree Age : "+age+"\n"+"Tree Height : "  +height);
}

}
