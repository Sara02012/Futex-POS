

package pos;


public class Customer
{

    int ID;
    int Fax;
    int Phone;
    String Name;
    String City;
    String PostalCode;
    String POBox;
    String CountryCode;
    String Email;


public Customer()
{

}
public Customer(int Cusid,String name,String city,String PosCode,String POB,String CountCode,int fax ,int phone)
{
         ID = Cusid;
        Name = name;
        City = city;
        PostalCode = PosCode;
        CountryCode = CountCode;
        Fax = fax;
        Phone = phone;
}

public void setCutomersId(int Cusid)
  {
    ID = Cusid;
  }

public void setCustomerName(String name)
  {
    Name = name;
  }
public void setCustomerCity(String city)
  {
   City = city;
  }

public void setCustomerPostalCode(String PosCode)
  {
     PostalCode = PosCode;
  }
public void setCustomerCountryCode(String CountCode)
  {
   CountryCode = CountCode;
  }
public void setCustomerFax(int fax)
  {
     Fax = fax;
  }
public void setCustomerPhone(int phone)
  {
    Phone = phone;
  }
}


