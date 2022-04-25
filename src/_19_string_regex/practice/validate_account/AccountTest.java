package _19_string_regex.practice.validate_account;

public class AccountTest {
    private static AccountExample accountExample;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String item : validAccount) {
            boolean isvalid = accountExample.validate(item);
            System.out.println("Account is " + item + " is valid: " + isvalid);
        }
        for (String account : invalidAccount) {
            boolean invalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is invalid: " + invalid);
        }
    }
}
