import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * @author Moustafa Sven Hawi
 * @date 15.02.2022
 * @version 1.0
 * Dieser Code ist von einem YouTube Video, der Ersteller des Videos ist Bro Code.
 */
public class GamePanel extends JPanel implements ActionListener {
    //Grösse des Frames festlegen.
    public static final int SCREEN_WIDTH = 600;
    public static final int SCREEN_HIGHT = 600;
    //Grösse der Objekte im Spiel festlegen.
    public static final int UNIT_SIZE = 25;
    //Berechnet wie viel Objekte im Frame platz haben.
    public static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HIGHT)/UNIT_SIZE;
    public static final int DELAY = 75;
    //Diese Arrays halten die x und y Koordinaten der Schlange.
    public int x[] = new int[GAME_UNITS];
    public int y[] = new int[GAME_UNITS];
    //Mit wie vielen Körperteilen man anfängt.
    int bodyParts = 6;
    int applesEaten;
    //Wo der Apfel landet auf der x Koordinate. Wird random gewählt.
    int appleX;
    //Wo der Apfel landet auf der y Koordinate. Wird random gewählt.
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;
    //Konstruktor
    public GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
    public void startGame(){
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
    public void draw(Graphics g){

    }
    public void newApple(){

    }
    public void move(){

    }
    public void checkApple(){

    }
    public void checkCollisions(){

    }
    public void gameOver(Graphics g){

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            
        }
    }
}
