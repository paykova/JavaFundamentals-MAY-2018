package p03_Mankind;

public class Human {

    private static final String INVALID_FIRST_NAME_LENGTH_MSG = "Expected length at least 4 symbols!Argument: firstName";
    private static final String INVALID_FIRST_NAME_CASE_LETTER_MSG ="Expected upper case letter!Argument: firstName";
    private static final String INVALID_LAST_NAME_LENGTH_MSG = "Expected length at least 3 symbols!Argument: lastName";
    private static final String INVALID_LAST_NAME_CASE_LETTER_MSG = "Expected upper case letter!Argument: lastName";
    //private static final String STRING_NAME_PATTERN = "[A-Z][a-z]+";
    private static final String STRING_NAME_PATTERN = "^[a-z]\\w+$";

    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        if(firstName.length()<4){
            throw new IllegalArgumentException(INVALID_FIRST_NAME_LENGTH_MSG);
        }
        if(firstName.matches(STRING_NAME_PATTERN)){
            throw new IllegalArgumentException(INVALID_FIRST_NAME_CASE_LETTER_MSG);
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        if (lastName.length()<3){
            throw new IllegalArgumentException(INVALID_LAST_NAME_LENGTH_MSG);
        }
        if(lastName.matches(STRING_NAME_PATTERN)){
           throw new IllegalArgumentException(INVALID_LAST_NAME_CASE_LETTER_MSG);
        }
        this.lastName = lastName;
    }
}
