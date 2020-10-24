package mainpackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {


        FullTimeStudent fullstu1 = new FullTimeStudent();

        ArrayList<PhdThesis> phdt= new ArrayList<PhdThesis>();
        phdt.add(new PhdThesis(101, "Basic Math", "Math", fullstu1));

        fullstu1.setRegistration(10);
        fullstu1.setName("Mahfuz");

        ArrayList<PhDCourse> phdc = new ArrayList<PhDCourse>();
        phdc.add(new PhDCourse(102, "OOP", "OOP"," Professor . Dr. Syed Akhter Hossain",true));

        PhDProgram  phdparttime1 = new PhDProgram(301,phdc.get(0),phdt.get(0));

        fullstu1.setPhdprogram(phdparttime1);
         fullstu1.display();


    }
}
