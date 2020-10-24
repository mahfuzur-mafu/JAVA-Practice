package mainpackage;

public class PhdThesis {
    private int thesisCode;
    private String thesisTropic;
    private String thesisArea;
    private Student student;

    public PhdThesis() {
    }

    public PhdThesis(int thesisCode, String thesisTropic, String thesisArea, Student student) {
        this.thesisCode = thesisCode;
        this.thesisTropic = thesisTropic;
        this.thesisArea = thesisArea;
        this.student = student;
    }

    public int getThesisCode()
    {
        return thesisCode;
    }

    public void setThesisCode(int thesisCode)
    {

        this.thesisCode = thesisCode;
    }

    public String getThesisTropic()
    {

        return thesisTropic;
    }

    public void setThesisTropic(String thesisTropic)
    {
        this.thesisTropic = thesisTropic;
    }

    public String getThesisArea()
    {
        return thesisArea;
    }

    public void setThesisArea(String thesisArea)
    {
        this.thesisArea = thesisArea;
    }

    public Student getStudent()
    {
        return student;
    }

    public void setStudent(Student student)


    {
        this.student = student;
    }

    public void display()

    {
        System.out.println("\nPhDTesis");
        System.out.println("Thesis Code: "+thesisCode+"\n"+" Thesis Tropic: "+thesisTropic+"\n"+" Thesis Area: "+thesisArea+"\n");

    }
}
