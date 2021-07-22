import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CanvasClass extends Frame {

    public CanvasClass(){

        Frame frame = new Frame("Canvas");

        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setLayout(null);

        frame.add(new MyCanvas());

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }



    public static void main(String[] args) {

        CanvasClass cc = new CanvasClass();

    }
}

class MyCanvas extends Canvas{

    public MyCanvas() {

        setBackground(Color.red);
        setSize(200,200);

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(50,50,100,100);
    }
}