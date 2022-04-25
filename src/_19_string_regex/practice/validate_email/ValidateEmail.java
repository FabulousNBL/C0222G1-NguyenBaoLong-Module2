package _19_string_regex.practice.validate_email;

public class ValidateEmail {
    private static EmailExample emailExample;
    public static final String[] validEmail= new String[]{"a@gmail.com", "b@yahoo.com", "c@hotmail.com"};
    public static final String[] invalidEmail= new String[]{"@gmail.com", "@gmail.", "@#c@gmail.com"};

    public static void main(String[] args) {
        emailExample= new EmailExample();
        for (String email:validEmail) {
            boolean isvalid= emailExample.validate(email);
            System.out.println("Email is "+ email+ " is valid: "+ isvalid);
        }
        for (String email:invalidEmail) {
            boolean isvalid= emailExample.validate(email);
            System.out.println("Email is "+ email+" is invalid: "+isvalid);
        }
    }
}
