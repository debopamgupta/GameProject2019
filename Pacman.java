import java.awt.EventQueue;
import javax.swing.JFrame;

public class Pacman extends JFrame {

  private static final long serialVersionUID = 1L;

  public Pacman() {

    initUI();
  }

  private void initUI() {

    add(new Board());

    setTitle("PacmanDev"); // window title
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(380, 420);
    // setSize(720, 480); // for setting window size 
    setLocationRelativeTo(null);
    setResizable(false);
  }

  public static void start() {

    EventQueue.invokeLater(() -> {
      Pacman ex = new Pacman();
      ex.setVisible(true);
    });
  }
}