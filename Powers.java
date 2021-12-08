public class Powers {
  public static void main(String[] args) {
    int i = 0;
    int num = (int) Math.pow(2, i);
    while (num < 694) {
      System.out.println(num);
      i++;
      num = (int) Math.pow(2, i);
    }
    // lol
  }
}
