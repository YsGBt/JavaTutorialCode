package homework.section20;


public class RemoveDuplicate {

  public static void main(String[] args) {
    String str = "我我我、、、我我、、我要、我要要、、、要要要、、要要、、学学学、、、、学学编、、、学编编编、、编编编程、、程程";
    str = str.replaceAll("(、+)", "");
    str = str.replaceAll("(.)\\1+", "$1");
    System.out.print(str); // 我要我要学编学编程
  }
}
