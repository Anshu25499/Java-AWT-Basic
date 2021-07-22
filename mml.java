import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Error in this code.Label not working. Fix it after sometime.

public class mml {

    public mml(){

        Frame frame = new Frame("mml");

        Label label = new Label("Click me");
        label.setBounds(100,20,150,50);

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = frame.getGraphics();
                g.setColor(Color.orange);
                g.fillOval(e.getX(),e.getY(),5,5);

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                Graphics g = frame.getGraphics();
                g.setColor(Color.orange);
                g.fillOval(e.getX(),e.getY(),5,5);
            }
        });


        frame.add(label);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });



        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setLayout(null);
    }

    public static void main(String[] args) {
        new mml();
    }
}
