

package pos;

public class Payment_Method {

    int ID;
    String Name;
    int CheckID;

    public Payment_Method ()
    {
    }

    public Payment_Method (int id,String name,int chid)
    {
        ID = id;
        Name = name;
        CheckID = chid;
    }

    public void setMethodID(int id)
    {
    ID = id;
    }
    public void setMethodName(String name)
    {
        Name = name;
    }
    public void setCheckId(int chid)
    {
     CheckID = chid;
    }
     public String getCheckMethod()
     {
         String method = "Method ID" + ID;
         method = method + "\nMethod Name" + Name;
         method = method + "\nCheck ID" + CheckID;
         return method;
     }

}
