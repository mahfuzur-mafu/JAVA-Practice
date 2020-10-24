package mainpackage;

public class PhDCourse implements Course{

    private int courseCode;
    private String courseName;
    private String courseArea;
    private String courseInstructor;
    private boolean isInProgram = false;

    public PhDCourse()
    {

    }

    public PhDCourse(int courseCode, String courseName, String courseArea, String courseInstructor, boolean isInProgram)
    {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseArea = courseArea;
        this.courseInstructor = courseInstructor;
        this.isInProgram = isInProgram;
    }

    @Override
    public void setInstructorName(String name)
    {
        this.courseInstructor=name;
    }

    public int getCourseCode()
    {
        return courseCode;
    }

    public void setCourseCode(int courseCode)
    {
        this.courseCode = courseCode;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getCourseArea()
    {
        return courseArea;
    }

    public void setCourseArea(String courseArea)
    {
        this.courseArea = courseArea;
    }


    public String getCourseInstructor()
    {
        return courseInstructor;
    }

    public void display(){
        System.out.println("PhDCourse");
        System.out.println("Course Code : "+courseCode+ "\n"+" Course Name: "+courseName+"\n"+" Course Area: "+courseArea+"\n"+" Instructor : "+courseInstructor+"\n"+ " Available: "+isInProgram +"\n");
    }


}
