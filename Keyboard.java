import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Keyboard {
    Label label;
    TextArea textArea;

    public Keyboard(){
        Frame frame = new Frame("Key Detector");

         label = new Label("Check");
        label.setBounds(50,50,300,40);
        label.setAlignment(Label.CENTER);
        label.setBackground(Color.GRAY);

         textArea = new TextArea();
        textArea.setBounds(50,100,200,200);

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                String data = textArea.getText();
                String word[]=data.split(" ");
                label.setText("Total word = " +word.length+ " Total char = "+ (data.length()+1));
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                String data = textArea.getText();
                String word[]=data.split(" ");
                label.setText("Total word = " +word.length+ " Total char = "+ data.length());
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.add(textArea);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400,300);
    }

    public static void main(String[] args) {
        new Keyboard();
    }
}
