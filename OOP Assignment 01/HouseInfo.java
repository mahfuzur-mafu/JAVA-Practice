package grambangla;

public class HouseInfo {
    String name;
    String color;
    String address;



   HouseInfo()
   {
       this.name=null;
       this.color=null;
       this.address=null;



   }

   HouseInfo(String name , String color , String address,String home)
   {
       this.name= name ;
       this.color=color;
       this.address=address;




   }


   public void getHouse()
   {
       System.out.println("House Name : "+name+"\n"+"House color : "+color+"\n"+"House Address : "  +address);
   }


}

