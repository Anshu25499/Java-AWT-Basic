import java.awt.*;
import java.awt.event.*;

public class PopUp extends Frame {

    public PopUp(){

        Frame frame = new Frame();
        frame.setTitle("PopUp MenuBar");

        PopupMenu pop = new PopupMenu();

        MenuItem cut = new MenuItem("Cut");
        cut.setActionCommand("Cut");
        MenuItem copy = new MenuItem("Copy");
        copy.setActionCommand("Copy");
        MenuItem paste = new MenuItem("Paste");
        paste.setActionCommand("Paste");

        pop.add(cut);
        pop.add(copy);
        pop.add(paste);


        frame.add(pop);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pop.show(frame, e.getX(), e.getY());
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400,400);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {

        PopUp pop = new PopUp();
    }
}
