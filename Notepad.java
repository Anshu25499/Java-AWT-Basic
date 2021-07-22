import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Notepad extends Frame {

    public Notepad(){

        MenuBar menuBar = new MenuBar();

        Menu file = new Menu("file");
        Menu dit = new Menu("Edit");
        Menu sub = new Menu("SubMenu");

        MenuItem New = new MenuItem("New");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");

        MenuItem o1 = new MenuItem("Font");
        MenuItem o2 = new MenuItem("Design");
        MenuItem o3 = new MenuItem("Layer");
        MenuItem o4 = new MenuItem("Color");

        file.add(sub);
        file.add(New);
        file.add(save);
        file.add(exit);

        dit.add(o1);
        dit.add(o2);
        dit.add(o3);
        dit.add(o4);

        sub.add(save);
        sub.add(o2);

        setTitle("MenuCreation");
        setVisible(true);
        setSize(400,300);
        setLayout(null);

        menuBar.add(file);
        setMenuBar(menuBar);

        menuBar.add(dit);
        setMenuBar(menuBar);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }


    public static void main(String[] args) {
        Notepad n = new Notepad();
    }
}
