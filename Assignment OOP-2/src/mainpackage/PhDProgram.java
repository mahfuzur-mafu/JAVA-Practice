package mainpackage;

public class PhDProgram {
    private int deptCode;
    private PhDCourse phdcourse ;
    private PhdThesis phdthesis ;

    public PhDProgram()
    {


    }

    public PhDProgram(int deptCode, PhDCourse phdcourse, PhdThesis phdthesis)

    {
        this.deptCode = deptCode;
        this.phdcourse = phdcourse;
        this.phdthesis = phdthesis;
    }

    public int getDeptCode()
    {
        return deptCode;
    }

    public void setDeptCode(int deptCode)
    {
        this.deptCode = deptCode;
    }

    public void display(){
        System.out.println("\nPhDProgram");
        System.out.println("\nDepartment :"+deptCode);
        System.out.println();
        phdcourse.display();
        phdthesis.display();
    }
}
