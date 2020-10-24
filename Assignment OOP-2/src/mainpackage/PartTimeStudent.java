package mainpackage;

public class PartTimeStudent extends Student{

    private PhDProgram phDprogram;

    public PartTimeStudent()
    {

    }

    public PartTimeStudent(int registration, String name, PhDProgram phDprogram)
    {
        super(registration, name);
        this.phDprogram = phDprogram;
    }

    public PhDProgram getPhDprogram()
    {
        return phDprogram;
    }

    public void setPhDprogram(PhDProgram phDprogram)
    {
        this.phDprogram = phDprogram;
    }

    public void display()
    {
        super.toString();
        phDprogram.display();
    }
}
