import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Pannel extends Frame {

    public Pannel(){
        Frame frame = new Frame("Panel_Creation");

        Panel panel = new Panel();
        panel.setBounds(40,40,300,200);
        panel.setBackground(Color.cyan);
        panel.setForeground(Color.white);

        Label label = new Label();
        label.setText("Panel Created");
        label.setBounds(40,40,100,40);
        label.setBackground(Color.GRAY);
        label.setForeground(Color.green);

        Button button = new Button("Button");
        button.setBounds(50,100,50,30);
        button.setBackground(Color.PINK);

        Button button1 = new Button("Button1");
        button1.setBackground(Color.orange);
        button1.setBounds(100,200,50,30);


        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.add(panel);
        panel.add(label);
        panel.add(button);
        panel.add(button1);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        Pannel pannel = new Pannel();
    }
}
