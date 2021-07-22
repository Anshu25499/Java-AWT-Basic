import java.awt.*;
import java.awt.event.*;

public class awt_1 extends Frame implements WindowListener, ActionListener {
    Label label;
    Checkbox checkbox, checkbox1;

    public awt_1() {
        //After extending the Frame class in this we can directly use it by not creating any object of the frame class.
//        Button button = new Button("Click me");
//        button.setBounds(20,40,80,30);
//        add(button);
//
//        setLayout(null);
//        setSize(400,300);
//        setVisible(true);
//
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                Frame frame = (Frame)e.getSource();
//                frame.dispose();
//            }
//        });

        Frame frame = new Frame("First gui");

//        TextArea textArea = new TextArea("");
//        textArea.setBounds(250,40,200,200);
//        frame.add(textArea);

//        TextField textField = new TextField();
//        textField.setBackground(Color.black);
//        textField.setForeground(Color.white);
//        textField.setBounds(20, 110, 150, 30);
//        frame.add(textField);
        CheckboxGroup checkboxGroup = new CheckboxGroup();

        checkbox = new Checkbox("java", checkboxGroup, false);
        checkbox.setBounds(20, 150, 50, 30);
        frame.add(checkbox);

        checkbox1 = new Checkbox("python",checkboxGroup,false);
        checkbox1.setBounds(20, 180, 60, 30);
        frame.add(checkbox1);


        //Here we are using itemListener to write on the label that what we have selected.
        checkbox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("You have selected python.");
                checkbox.setState(false);
            }
        });

        //Here we are using itemListener to write on the label that what we have selected.
        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("You have selected java.");
                checkbox1.setState(false);
            }
        });

        Button button = new Button("Click me");
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        button.setBounds(20, 120, 80, 20);
        frame.add(button);

        label = new Label("label");
       // label.setBackground(Color.black);
        label.setForeground(Color.black);
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
       // label.setBounds(20, 80, 150, 20);
        frame.add(label);


        //ActionListener inside the constructor
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                label.setText("Clicked");
//            }
//        });

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);

//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                frame.dispose();
//            }
//        });

        //Creating the action-listener outside of the constructor.
        frame.addWindowListener(this);
        button.addActionListener(this);
//        checkbox.addItemListener(this);
    }


    @Override
    public void windowOpened(WindowEvent e) {

        System.out.println("Window is opened.");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        label.setText("Clicked");
    }

//    @Override
//    public void itemStateChanged(ItemEvent e) {
//        if (e.getSource()==checkbox)
//        {
//            label.setText("You have selected java.");
//            checkbox1.setState(false);
//        }
//        else if (e.getSource()==checkbox1)
//        {
//            label.setText("You have selected python.");
//            checkbox.setState(false);
//        }
//        else
//        {
//            label.setText("You have not selected.");
//        }



    @Override
    public void windowClosing(WindowEvent e) {
        Frame frame = (Frame) e.getSource();
        frame.dispose();
        System.out.println("Window closing.");
    }

    @Override
    public void windowClosed(WindowEvent e) {

        System.out.println("Window is closed.");
    }

    @Override
    public void windowIconified(WindowEvent e) {

        System.out.println("Window is confined.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window is de-confined.");
    }

    @Override
    public void windowActivated(WindowEvent e) {

        System.out.println("Window is activated.");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

        System.out.println("Window is deactivated.");
    }

    public static void main(String[] args) {
        awt_1 obj1 = new awt_1();

    }

}
