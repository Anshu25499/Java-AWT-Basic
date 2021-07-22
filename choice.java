import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class choice {

    public choice(){
        Frame frame = new Frame("Choice");

        List list = new List(4,false);
        list.setBounds(100,120,80,40);

        list.add("name1");
        list.add("name2");
        list.add("name3");
        list.add("name4");

        List list1 = new List(4,false);
        list1.setBounds(100,170,80,40);

        list1.add("class1");
        list1.add("class2");
        list1.add("class3");
        list1.add("class4");

        Label label = new Label("Select the option.");
        label.setBounds(90,80,150,30);
//        label.setAlignment(Label.CENTER);

        Button  button = new Button("You selected option is..");
        button.setBounds(90,50,80,25);


        Choice choice = new Choice();
        choice.setBounds(20,50,80,80);

        choice.add("Java");
        choice.add("Python");
        choice.add("C++");
        choice.add("C");
        choice.add("PHP");

        frame.add(choice);
        frame.add(button);
        frame.add(label);
        frame.add(list);
        frame.add(list1);


        frame.setLayout(null);
        frame.setSize(400,300);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        //Action listener for the selected language.
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String select = "You have selected "+ choice.getItem(choice.getSelectedIndex());
                label.setText(select);
                System.out.println("Working");
            }
        });

        //Action listener for the list.
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = list.getItem(list.getSelectedIndex())+ " " +list1.getItem(list1.getSelectedIndex())+ " is your name";
                label.setText(data);
            }
        });
    }

    public static void main(String[] args) {
      choice n = new choice();
    }
}
