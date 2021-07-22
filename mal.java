import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mal {

    public mal(){
        Frame frame = new Frame("Mouse action listener");

        Label label = new Label("Click me");
        label.setBounds(100,20,150,50);
        label.setBackground(Color.DARK_GRAY);
        label.setForeground(Color.green);
        frame.add(label);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
               label.setText("Mouse Pressed.");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released.");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered.");
            }

            @Override
            public void mouseExited(MouseEvent e) {
               label.setText("Mouse Exited.");
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400,300);
    }

    public static void main(String[] args) {
        new mal();
    }
}
