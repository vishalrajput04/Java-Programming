class StaticMethod {

  public static int vishu(int n) {

    for (int i = 1; i <= 10; i++) {

      System.out.println(i * n);

    }
    return 0;

  }

  public static void main(String[] args) {

    System.out.println("vishal");
    vishu(2);
  }
}