package grambangla;

import java.util.Scanner;

public class MainClaas {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome To our Village ");
        System.out.println("\nVillage ionformation");


        VillageInfo v1= new VillageInfo("Tarapur","7km",57);
        v1.getVillage();

        System.out.println("\nvillage River information");


        RiverInfo r1 = new RiverInfo("Jamuna","200m",true,true);

        //  r1.name= input.nextLine();
        // r1.area= input.nextLine();
        r1.getRiver();

        System.out.println("\nVillage Human Information");


        HumanInfo h1= new HumanInfo();
        h1.name= input.nextLine();
        h1.age= input.nextInt();
        h1.year=input.nextInt();
        input.nextLine();
        h1.job=input.nextLine();

        h1.getHuman();

        System.out.println("\nvillage Tree Infomation");

       TreeInfo tr1= new TreeInfo();

        tr1.name= input.nextLine();
        tr1.age= input.nextInt();
        input.nextLine();
       tr1.height=input.nextLine();

        tr1.getTree();

        System.out.println("\nVillage house Information");

        HouseInfo t1= new HouseInfo();
       // input.nextLine();
        t1.name= input.nextLine();
        t1.color= input.nextLine();
       // input.nextLine();
        t1.address=input.nextLine();
        t1.getHouse();




    }



}
