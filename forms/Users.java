

package forms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import pos.DatabaseConnection;

public class Users extends JFrame{
    
    
    Connection conn;
    
    JPanel addUserPanel;
    JPanel removeUserPnel;
    JPanel EditUserPanel;
    
    JTabbedPane tab=new JTabbedPane();
    
    JButton addbutton ;
    JButton searbutton ;
    JButton upbutton ;
    
    
    //this text fields are for adding user
    JTextField tid;
    JTextField tname;
    JPasswordField tpass;
    JTextField tddress;
    JTextField tPhone;
    JTextField Uemail;
    JTextField tcount;
    JTextField toffeicphone;
    JTextField tpost;
    JTextField tbox;
    
    //this text fields are for editing user
    JTextField id_edit;
    
    
    
    //this text Fields are for deleting users
    JTextField id_Delete;
    
    
    public Users()
    {
        
        super("Users");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DatabaseConnection.setConnectionString("posuser", "posuser", "//192.168.1.100", "pos", 3306);
        DatabaseConnection.connectToDatabase(true);
        conn=DatabaseConnection.getConnection();
        
        tab = new JTabbedPane();

        addUser();
        EditUser();
        deleteUser();

        setSize(400,400);
        setVisible(true);
        
    }
    
    
    public static void main (String [] orgs)
    {
        Users user=new Users();
    
    }
    
    
    private void addUser()
    {
        
        addUserPanel = new JPanel();
        addUserPanel.setLayout(new GridLayout(0,2));


        JLabel lid = new JLabel ("User ID");
        tid= new JTextField (10);

        JLabel lname = new JLabel ("User Name");
        tname = new JTextField (10);

        JLabel lpass = new JLabel ("User Password");
        tpass= new JPasswordField (10);

        JLabel ladd = new JLabel ("User Address");
        tddress= new JTextField (10);


        JLabel phone = new JLabel ("User Phone");
        tPhone= new JTextField (10);

        JLabel email = new JLabel ("User Email");
        Uemail= new JTextField (10);

        JLabel lcount = new JLabel ("User Country");
        tcount= new JTextField (10);

        JLabel lofficephone = new JLabel ("Office Phone");
        toffeicphone= new JTextField (10);

        JLabel lpost = new JLabel ("Postal code");
        tpost= new JTextField (10);

        JLabel lbox = new JLabel ("PO BOX");
        tbox= new JTextField (10);

        addbutton = new JButton ("ADD");
        

        addUserPanel.add(lid);
        addUserPanel.add(tid);

        addUserPanel.add(lname);
        addUserPanel.add(tname);

        addUserPanel.add(lpass);
        addUserPanel.add(tpass);



        addUserPanel.add(ladd);
        addUserPanel.add(tddress);

        addUserPanel.add(phone);
        addUserPanel.add(tPhone);

        addUserPanel.add(email);
        addUserPanel.add(Uemail);

        addUserPanel.add(lcount);
        addUserPanel.add(tcount);


        addUserPanel.add(lofficephone);
        addUserPanel.add(toffeicphone);

        addUserPanel.add(lpost);
        addUserPanel.add(tpost);

        addUserPanel.add(lbox);
        addUserPanel.add(tbox);

        addUserPanel.add(addbutton);
        
        addbutton.addActionListener(new addButtonListenter());

        
        add(tab);
        tab.add("Add User", addUserPanel);
        
    }
    
    
    
    private class addButtonListenter implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
//            try {
//                Statement statement=conn.createStatement();
                
                String userID= tid.getText();
                String userPassword= tpass.getText();
                String userAddress= tddress.getText();
                String userPhone= tPhone.getText();
                String userEmail=Uemail.getText();
                String userCountry=tcount.getText();
                String userOfficePhone= toffeicphone.getText();
                String userPostOffice= tpost.getText();
                String userBox=tbox.getText();
                
                //checking if the some of the fields are empty
                if(userID.equals("") || userPassword.equals("") || userAddress.equals("") 
                        || userPhone.equals("") || userEmail.equals("") || userCountry.equals("") 
                        || userOfficePhone.equals("") || userPostOffice.equals("") || userBox.equals("") )
                {
                    JOptionPane.showMessageDialog(null, "Error: You have to fill all the fields");
                }else{ 
                    
                    try{
                        int id=Integer.parseInt(userID);
                        System.out.println(userID);
                        System.out.println(userPassword);
                        System.out.println(userAddress);
                        System.out.println(userPhone);
                        System.out.println(userEmail);
                        System.out.println(userCountry);
                        System.out.println(userOfficePhone);
                        System.out.println(userPostOffice);
                        System.out.println(userBox);
                    }catch(NumberFormatException ex)
                    {
                       // JOptionPane.showMessageDialog(null, "Error: You have to enter an integer values for User ID, Phone, Office Phone, Postal Code and Post Office fields");
                        JOptionPane.showMessageDialog(null, "Error "+ex.getMessage()+", It should be integer");
                    }
                }
                
//            } catch (SQLException ex) {
//                Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
//            }
            
        }
        
    }
    
    
     private class deleteButtonListenter implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            
            String id=id_Delete.getText();
            System.out.println(id);
            
        }
        
    }
     
     
    private void deleteUser()
    {
        removeUserPnel=new JPanel();
        removeUserPnel.setLayout(new GridLayout(10,1));
        
        JLabel label=new JLabel("Enter the user ID to be deleted");
       // label.setText();
        id_Delete=new JTextField();
        searbutton=new JButton("Delete");
        searbutton.addActionListener(new deleteButtonListenter());
        
        removeUserPnel.add(label);
        removeUserPnel.add(id_Delete);
        removeUserPnel.add(searbutton);
        
        tab.add("Delete User",removeUserPnel);
        add(tab);
    }
    
    
    
    private void EditUser()
    {
        EditUserPanel=new JPanel();
        EditUserPanel.setLayout(new GridLayout(0,2));
        upbutton=new JButton("Edit");
        
        EditUserPanel.add(upbutton);
        tab.add("Edit User",EditUserPanel);
        add(tab);
    }

}
