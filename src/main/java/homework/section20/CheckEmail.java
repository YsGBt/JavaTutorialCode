package homework.section20;

public class CheckEmail {

  public static void main(String[] args) {
    String email = "zsy@sina.com";
    String regex = "^\\w+@\\w+(\\.[a-zA-Z]{2,3}){1,2}$";
    System.out.println(email.matches(regex));
  }
}
