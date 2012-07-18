
package forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Customer extends JFrame{
        public Customer()
        {

            super("Customers");
            
            JFrame addFrame=new JFrame("Add Customer");
            JFrame RemoveFrame=new JFrame("Romve Customer");
            JFrame EditFrame=new JFrame("Edit Customer");
            
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel jPanel1 = new JPanel();
            jPanel1.setLayout(new FlowLayout());


            JLabel Cusname = new JLabel ("Customer Name");
            JTextField cusname = new JTextField (10);

            JLabel Cusid = new JLabel ("Customer ID");
            JTextField tcusid= new JTextField (10);

            JLabel Cusadd = new JLabel ("Customer Address");
            JTextField Cusaddress= new JTextField (10);

            JLabel CusCount = new JLabel ("Customer Country");
            JTextField CusCountry= new JTextField (10);

            JLabel Cuscity = new JLabel ("Customer City");
            JTextField CusCity= new JTextField (10);

            JLabel phone = new JLabel ("Customer Phone");
            JTextField CusPhone= new JTextField (10);

            JLabel email = new JLabel ("Customer Email");
            JTextField CusEmail= new JTextField (10);

            JLabel fax = new JLabel ("Customer Fax");
            JTextField CusFax= new JTextField (10);

            JLabel maxdepit = new JLabel ("Max Depit");
            JTextField Cusmaxdepit= new JTextField (10);

            JLabel curdepit = new JLabel ("Max Depit");
            JTextField CusCurdepit= new JTextField (10);

            JButton addbutton = new JButton ("ADD");
            JButton searbutton = new JButton ("Search");
            JButton upbutton = new JButton ("Update");

            jPanel1.add(Cusname);
            jPanel1.add(cusname);

            jPanel1.add(Cusid);
            jPanel1.add(tcusid);

            jPanel1.add(Cusadd);
            jPanel1.add(Cusaddress);

            jPanel1.add(CusCount);
            jPanel1.add(CusCountry);

            jPanel1.add(Cuscity);
            jPanel1.add(CusCity);

            jPanel1.add(phone);
            jPanel1.add(CusPhone);

            jPanel1.add(email);
            jPanel1.add(CusEmail);

            jPanel1.add(fax);
            jPanel1.add(CusFax);

            jPanel1.add(maxdepit);
            jPanel1.add(Cusmaxdepit);

            jPanel1.add(curdepit);
            jPanel1.add(CusCurdepit);

            jPanel1.add(addbutton);
            jPanel1.add(searbutton);
            jPanel1.add(upbutton);

            JTabbedPane tab = new JTabbedPane();
            add(tab);
            tab.add("Customer", jPanel1);

            JPanel jPanel2 = new JPanel();
            jPanel2.setLayout(new FlowLayout());

            JLabel datestart = new JLabel ("Max Depit");
            JTextField DateStart= new JTextField (10);

            JLabel dateend = new JLabel ("Max Depit");
            JTextField DateEnd= new JTextField (10);


            jPanel2.add(datestart);
            jPanel2.add(DateStart);

            jPanel2.add(dateend);
            jPanel2.add(DateEnd);

            jPanel2.add(Cusname);
            jPanel2.add(cusname);

            JButton Repbutton = new JButton ("Report");
            jPanel2.add(Repbutton);

            tab.add("Report", jPanel2);

            setSize(400,400);
            setVisible(true);
      }
        
//        private class ButtonHandler implements ActionListener
//        {
//            public void actionPerformed(ActionEvent event)
//            {
//                if()
//            }
//        }
        
        
}