

package pos;


public class PayFor {

    int ID;
    String Name;
    float Amount;

public PayFor ()
{

}

public PayFor(int id,String name,float amount)
{
    ID = id;
    Name = name;
    Amount = amount;
}
public void setPayForId(int id)
{
ID = id;
}
public void setPayForName(String name)
{
Name = name;
}

public void setPayForAmount(float amount)
{
Amount = amount;
}

}
