

package forms;
import javax.swing.*;
import java.awt.*;

public class Sales extends  JFrame{


     public Sales()
    {
        super("Sales menu");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   JPanel jPanel1 = new JPanel();
    //jPanel1.setLayout(new FlowLayout());
   
    
    jPanel1.setLayout(new GridLayout(4,1));

    JPanel first=new JPanel();
    first.setLayout(new FlowLayout());
    JLabel Date = new JLabel ("Date");
    JTextField tDate= new JTextField (10);

    first.add(Date);
    first.add(tDate);
    jPanel1.add(first);
    Object rowData[][] = {{ " "," "," "," "," "}};

    Object columnNames[] = { "Iteme", "Price", "Unit","Taxes","Value"};
    JTable table = new JTable(rowData, columnNames);

    JScrollPane scrollPane = new JScrollPane(table);
    JTabbedPane tab = new JTabbedPane();
    add(tab);
    jPanel1.add(scrollPane);
 
    JPanel second=new JPanel(new FlowLayout());
    JButton backbutton = new JButton ("<<<");
    JButton forwardbutton = new JButton (">>>");
    JButton delbutton = new JButton ("Delete");
    JButton searbutton = new JButton ("Search");
    //JButton Editbutton = new JButton ("Edit");

    second.add(backbutton);
    second.add(forwardbutton);
    second.add(delbutton);
    second.add(searbutton);
    jPanel1.add(second);

    JLabel Taxes = new JLabel ("Taxes :");
    JTextField TaxeValue = new JTextField (10);

    JLabel Subtotal = new JLabel ("Subtotal");
    JTextField SubtotalValue= new JTextField (10);

    JLabel total = new JLabel ("Total");
    JTextField TatalValue= new JTextField (10);


    JLabel Payment = new JLabel ("Payment");
    JTextField PaymentValue= new JTextField (10);

    JLabel Remaning = new JLabel ("Remaining");
    JTextField RemaningValue = new JTextField (10);


JPanel third=new JPanel(new GridLayout(5,4));
    third.add(Taxes);
    third.add(TaxeValue);

     third.add(Subtotal);
    third.add(SubtotalValue);
   ///////////////////
    
   
   
   third.add(new JLabel(""));
   third.add(new JLabel(""));
    third.add(total);
    third.add(TatalValue);

     third.add(new JLabel(""));
   third.add(new JLabel(""));
   
    third.add(Payment);
    third.add(PaymentValue);

     
   third.add(new JLabel(""));
   third.add(new JLabel(""));
   
    third.add(Remaning);
    third.add(RemaningValue);

      /*if the Salaer wants to add new item manualy, he will use add button after typing
    tha barcode of the iteme in the text filed */

    JButton addbutton = new JButton ("ADD");
    JTextField barcode = new JTextField (10);

    third.add(addbutton);
    third.add(barcode);
jPanel1.add(third);

    tab.add("Salaes", jPanel1);
    setSize(400,400);
    setVisible(true);


    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new FlowLayout());
    JLabel Invoice = new JLabel ("Invoice");
    jPanel2.add(Invoice);
    tab.add("Edit Sales", jPanel2);


 


    }
     

}
