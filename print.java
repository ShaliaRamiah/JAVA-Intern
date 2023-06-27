import java.util.*;

public class print {
  public static int FirstMethod(String a) {
    String testVariable = a;
    System.out.print("Hello " + testVariable);
    return 0;
  }

        public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String testVariable;
    testVariable = in.nextLine();
    FirstMethod(testVariable);
  }
}

