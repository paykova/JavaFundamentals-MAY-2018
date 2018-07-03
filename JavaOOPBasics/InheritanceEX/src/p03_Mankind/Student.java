package p03_Mankind;

public class Student extends Human {

    private static final String INVALID_FACULTY_NUMBER = "Invalid faculty number!";


    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        if(facultyNumber.length() < 5 || facultyNumber.length() > 10){
            throw new IllegalArgumentException(INVALID_FACULTY_NUMBER);
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();

        sb
                .append("First Name: ").append(this.getFirstName()).append(System.lineSeparator())
                .append("Last Name: ").append(this.getLastName()).append(System.lineSeparator())
                .append("Faculty number: ").append(this.getFacultyNumber());

        return sb.toString();

    }
}
