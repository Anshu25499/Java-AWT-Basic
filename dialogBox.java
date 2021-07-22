import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class dialogBox extends Frame {

    private static Dialog dialog;


    public dialogBox(){
        Frame frame = new Frame("Dialog Box");

        dialog = new Dialog(frame,"dialogBox",true);
        dialog.setLayout(new FlowLayout());


        Button button = new Button("Check");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogBox.dialog.setVisible(false);
            }
        });

        dialog.add(new Label("This is a dialog box."));
        dialog.add(button);
        dialog.setSize(200,200);
        dialog.setVisible(true);


        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        dialogBox dialogBox = new dialogBox();
    }
}
