import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class toolkit {

    public toolkit(){
        Frame frame = new Frame("Toolkit");

        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Himanshu\\Pictures\\Screenshots\\Screenshot (9).png");
        frame.setIconImage(icon);

        Button button = new Button("Beep");
        button.setBounds(150,150,50,30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit.getDefaultToolkit().beep();
            }
        });

        frame.add(button);
        frame.setSize(400,400);;
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }

    public static void main(String[] args) {
        toolkit toolkit = new toolkit();
    }
}
