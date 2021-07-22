import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Scroll extends Frame {

    public Scroll() {
        //Applying the frame Class by extending it in the outside class from where it can be accessed everywhere.

        setTitle("Scroll Bar");

        Label label = new Label();
        label.setBounds(20,10,300,50);

        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setBounds(50,50,20,200);

        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("scrollbar position is " + scrollbar.getValue());
            }
        });

        setVisible(true);
        setLayout(null);
        setSize(400,300);

        add(label);
        add(scrollbar);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Scroll s = new Scroll();
    }
}
