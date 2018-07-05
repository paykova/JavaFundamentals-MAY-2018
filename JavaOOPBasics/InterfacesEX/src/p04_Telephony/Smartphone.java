package p04_Telephony;

public class Smartphone implements Calling, Browsing{

    private static final String INVALID_PHONE_NUMBER_EX_MSG = "Invalid number!";
    private static final String INVALID_URL_EX_MESSAGE = "Invalid URL!";


    @Override
    public String browsing(String site) {
        if(site.matches(".*\\d.*")){
            throw new IllegalArgumentException(INVALID_URL_EX_MESSAGE);
        }
        return String.format("Browsing: %s!", site);
    }

    @Override
    public String calling(String phone) {
        if(!phone.matches("\\d+")){
            throw new IllegalArgumentException(INVALID_PHONE_NUMBER_EX_MSG);
        }
        return String.format("Calling... %s", phone);
    }
}
