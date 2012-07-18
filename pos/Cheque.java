

package pos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cheque {


    int ID;
    String BankName;
    String From;
    float Amount;
    String To;
    String Date;
    
    public Cheque()
    {
        ID=0;
        BankName="";
        From="";
        Amount=0.0f;
        To="";
        Date="";
    }
    
    
    public Cheque(int ChequeID,
    String bankname,
    String from,
    String to,
    float amount,
    String date)
    {
        ID=ChequeID;
        BankName=bankname;
        From=from;
        Amount=amount;
        To=to;
        Date=date;
    }



    public void setChequeID(int id)
    {
        ID=id;
    }

    public void setBankName(String name)
    {
        BankName=name;
    }

    public void setFrom(String from)
    {
        From=from;
    }

    public void setTo(String to)
    {
        To=to;
    }

    public void setAmount(float amount)
    {
        Amount=amount;
    }

    public void setDate(String date)
    {
        Date=date;
    }


    public String getChequeInfo()
    {
        String info="Cheque ID: "+ID;
        info=info+"\nBank Name: "+BankName;
        info=info+"\nAmount: "+Amount;
        info=info+"\nFrom: "+From;
        info=info+"\nTo: "+To;
        info=info+"\nDate: "+Date;
        
        
        return info;
    }

//    public boolean writeChequeToDatabase()
//    {
//        Connection conn=DatabaseConnection.getConnection();
//        try {
//            
//            Statement stat=conn.createStatement();
//            stat.
//        } catch (SQLException ex) {
//            return false;
//        }
//    }


}
