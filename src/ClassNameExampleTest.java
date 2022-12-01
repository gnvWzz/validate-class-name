public class ClassNameExampleTest {

    public static final String[] validClassName = new String[] {"C0318G"};
    public static final String[] invalidClassName = new String[] { "M0318G", "P0323A"};

    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        for (String account : validClassName) {
            boolean isvalid = classNameExample.validate(account);
            System.out.println("Class name is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidClassName) {
            boolean isvalid = classNameExample.validate(account);
            System.out.println("Class name is " + account +" is valid: "+ isvalid);
        }
    }
}
