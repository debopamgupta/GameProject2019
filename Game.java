import java.util.Scanner;

class Game {
  public static void main(String[] args) {
    int ch = 0;
    System.out.println("Enter 1 for Pacman and 2 for other");
    Scanner sc = new Scanner(System.in);
    ch = sc.nextInt();
    Game obj = new Game();
    obj.choicefn(ch);
    sc.close();
  }

    void choicefn(int c) {
    switch (c) {
    case 1:
      Pacman.start();
      break;

    case 2:
      System.out.println("Other game should start");
      break;
       
    default:
      System.out.println("Wrong choice");
    }
  }
}