import javax.swing.*;
import java.awt.*;

/**
 * @author Moustafa Sven Hawi
 * @date 15.02
 * @version 1.0
 * Dieser Code ist von einem YouTube Video, der Ersteller des Videos ist Bro Code.
 */
public class GameFrame extends JFrame {
    //Constructor
    public GameFrame(){
        //Man nimmt panel was man in der Klasse GamePanel erstellt hat und fügt das hier hinzu.
        GamePanel panel = new GamePanel();
        this.add(panel);
        //Der Titel des GUI's ist SnakeJava.
        this.setTitle("SnakeJava");
        //Damit das Programm nicht mehr läuft wenn man es ausschaltet.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Wird gebraucht, damit das Fenster des GUI's nicht vergrössert und verkleinert werden kann.
        this.setResizable(false);
        //Damit sich die einzelnen Panels dem Frame anpassen.
        this.pack();
        //Damit das GUI überhaupt Sichtbar wird.
        this.setVisible(true);
        //Damit es in der Mitte des Screens erscheint.
        this.setLocation(null);
    }
}
