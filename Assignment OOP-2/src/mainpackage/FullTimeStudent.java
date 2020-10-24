package mainpackage;

public class FullTimeStudent extends Student{

    private PhDProgram phdprogram;

    public FullTimeStudent()
    {


    }
    public FullTimeStudent(int registration, String name, PhDProgram phdprogram)
    {
        super(registration, name);
        this.phdprogram = phdprogram;
    }

    public PhDProgram getPhdprogram()
    {
        return phdprogram;
    }

    public void setPhdprogram(PhDProgram phdprogram)

    {
        this.phdprogram = phdprogram;
    }

    public void display()

    {
        System.out.println(super.toString());
        this.phdprogram.display();
    }


}
