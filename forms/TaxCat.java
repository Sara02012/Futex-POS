

package forms;
import javax.swing.*;
import java.awt.*;

public class TaxCat {

      public static void main (String [] orgs)
    {

    JFrame frame = new JFrame("Close Cash");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new FlowLayout());

    JLabel Lname = new JLabel ("Name");
    JTextField Tname= new JTextField (10);

    JLabel Lid = new JLabel ("ID");
    JTextField Tid= new JTextField (10);

    JButton addbutton = new JButton ("ADD");
    JButton delbutton = new JButton ("Delete");
    JButton editbutton = new JButton ("Edit");

    jPanel1.add(Lname);
    jPanel1.add(Tname);
    jPanel1.add(Lid);
    jPanel1.add(Tid);
    jPanel1.add(addbutton);
    jPanel1.add(delbutton);
    jPanel1.add(editbutton);


    JTabbedPane tab = new JTabbedPane();
    frame.add(tab);
    tab.add("Close Cash", jPanel1);

     frame.setSize(400,400);
    frame.setVisible(true);

}
}
