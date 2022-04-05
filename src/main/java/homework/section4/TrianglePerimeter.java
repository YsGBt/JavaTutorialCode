package homework.section4;

public class TrianglePerimeter {

  public static void main(String[] args) {
    System.out.println("Please input the three side of the triangle.");
    int[] threeNum = RankNumber.rankThree();
    if (threeNum[0] + threeNum[1] > threeNum[2]) {
      System.out.println(
          "The perimeter of the triangle is: " + (threeNum[0] + threeNum[1] + threeNum[2]));
    } else {
      System.out.println("Illegal Inputs.");
    }
  }
}
