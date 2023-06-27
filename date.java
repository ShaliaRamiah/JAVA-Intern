import java.util.*;
import java.time.*;
public class date {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int dateEnter = in.nextInt();
    LocalDate firstDay = LocalDate.of(2018, Month.JANUARY, dateEnter);
    System.out.println(firstDay);
  }
}