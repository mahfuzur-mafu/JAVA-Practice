package mainpackage;

public class Student {
    private int registration;
    private String name;

    public Student(){}

    public Student(int registration, String name) {
        this.registration = registration;
        this.name = name;
    }

    public int getRegistration()
    {
        return registration;
    }

    public void setRegistration(int registration)
    {
        this.registration = registration;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Reg.no: "+registration + " Name: "+ name;
    }

}
