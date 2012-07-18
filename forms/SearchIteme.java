

package forms;
import javax.swing.*;
import java.awt.*;

public class SearchIteme {


    public static void main (String [] orgs)
    {

    JFrame frame = new JFrame("Search");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new FlowLayout());

    JLabel BarCode = new JLabel ("Bar Code");
    JTextField tBarCode= new JTextField (10);

    JLabel Name = new JLabel ("Item Name");
    JTextField tName= new JTextField (10);

    JLabel Price = new JLabel ("Price");
    JTextField tPrice= new JTextField (10);

    JLabel Category = new JLabel ("Category");
    JTextField tCategory= new JTextField (10);

    JButton searbutton = new JButton ("Search");
    JButton resetbutton = new JButton ("Reset");
    JButton addbutton = new JButton ("ADD");

    jPanel1.add(BarCode);
    jPanel1.add(tBarCode);

     jPanel1.add(Name);
    jPanel1.add(tName);

    jPanel1.add(Price);
    jPanel1.add(tPrice);

    jPanel1.add(Category);
    jPanel1.add(tCategory);

    jPanel1.add(tCategory);
    jPanel1.add(addbutton);

    jPanel1.add(searbutton);
    jPanel1.add(resetbutton);
    jPanel1.add(addbutton);

   
    frame.add(jPanel1);
    frame.setSize(400,400);
    frame.setVisible(true);
    }

}
