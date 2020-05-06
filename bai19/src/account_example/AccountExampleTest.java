package account_example;

public class AccountExampleTest {
    private static final String[] account = new String[]{"codegym","Codegym","code_gym","0code-gym"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String check:account) {
            boolean checkAccount = accountExample.accountdate(check);
            System.out.println("Account : " + check + " is Valid : " + checkAccount);
        }
    }
}
