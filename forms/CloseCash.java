

package forms;

import javax.swing.*;
import java.awt.*;

public class CloseCash {
    public static void main (String [] orgs)
    {

    JFrame frame = new JFrame("Close Cash");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new FlowLayout());

    JLabel Sequence = new JLabel ("Sequence");
    JTextField tSequence= new JTextField (10);

    JLabel datestart = new JLabel ("Date Start");
    JTextField DateStart= new JTextField (10);

    JLabel dateend = new JLabel ("End Date");
    JTextField DateEnd = new JTextField (10);

    JButton prebutton = new JButton ("Print");
    JButton closebutton = new JButton ("Close Chash");

    jPanel1.add(Sequence);
    jPanel1.add(tSequence);
    jPanel1.add(datestart);
    jPanel1.add(DateStart);
    jPanel1.add(dateend);
    jPanel1.add(DateEnd);
    jPanel1.add(prebutton);
    jPanel1.add(closebutton);

    JTabbedPane tab = new JTabbedPane();
    frame.add(tab);
    tab.add("Close Cash", jPanel1);



    JPanel jPanel2 = new JPanel();
    jPanel1.setLayout(new FlowLayout());

    JLabel Startdate = new JLabel ("Start Date");
    JTextField startdate = new JTextField (10);

    JLabel Enddate = new JLabel ("End Date");
    JTextField enddate = new JTextField (10);



    jPanel2.add(Startdate);
    jPanel2.add(startdate);
    jPanel2.add(Enddate);
    jPanel2.add(enddate);

    tab.add("Closed Cash Report", jPanel2);


    frame.setSize(400,400);
    frame.setVisible(true);
}}
