package forms;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import pos.DatabaseConnection;


public class Login extends JFrame{
        private JLabel lname;
        private JLabel lpass;
        private JTextField tname;
        private JPasswordField tpass;
        private JButton blog;
        String username;// blank variable to call be through the stored procedure on SQL.
        String passsword; // blank variable to call be through the stored procedure on SQL.
        //setup GUI

        public Login()
        {
            super("Windows Login to POS");

            Container container = getContentPane();
            container.setLayout(new FlowLayout());

            // add components

            lname = new JLabel("User Name");
            container.add(lname);
            tname = new JTextField(10);
            container.add(tname);
            lpass = new JLabel("Password");
            container.add(lpass);
            tpass = new JPasswordField(10);
            container.add(tpass);
            blog = new JButton("Login");
            container.add(blog);


            ButtonHandler handler=new ButtonHandler();
            blog.addActionListener(handler);
            setSize(400,100);
            setVisible(true);
        }
        
        public static void main (String args[])
        {
            Login application=new Login();

            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        private class ButtonHandler implements ActionListener{
            public void actionPerformed (ActionEvent event)
            {
                
                ////////////////////////////////////////////////////////////////
                
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                String msg="";
                String username, password;
                Sales sales=new Sales();
                sales.setVisible(false);
                
                DatabaseConnection.setConnectionString("posuser", "posuser", "//192.168.1.103", "pos", 3306);
                DatabaseConnection.connectToDatabase(true);
                Connection conn=DatabaseConnection.getConnection();
                
                try {
                    
                    username=tname.getText();
                    password=tpass.getText();
                    Statement stmt=conn.createStatement();
                    ResultSet set=stmt.executeQuery("select authentication(\'"+username+"\' ,\'"+password+"\')");
                    
                    
                    
                    if(set.next())
                    {
                        String returnedMessage =set.getString(1);
                        
                        if ((returnedMessage.equals("WELCOME")))
                    //the username and password should be read from the database(worker table)
                        {
                            //msg = "Login Successful";
                            
                            
                            sales.setVisible(true);
                            
                        }else{
                            
                            msg = "Login Failed";
                            JOptionPane.showMessageDialog(null,msg);
                        }
                    }else{
                        
                        msg = "Login Failed";
                        JOptionPane.showMessageDialog(null,msg);
                    }
                
                }
                
                catch(SQLException SQLEx) {
                    
                    System.out.println("MySQL error: "+SQLEx.getErrorCode()+
                            " SQLSTATE:" +SQLEx.getSQLState());
                    System.out.println(SQLEx.getMessage());
                
                }
            }
        });
                
                ////////////////////////////////////////////////////////////////
                
                
               
                
                
            }
        }
}
