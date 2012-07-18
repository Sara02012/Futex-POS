

package pos;
import java.util.Properties;


public class main {

    public static void main(String[] orgs)
    {
        Properties prop = new Properties();

        prop.setProperty("database", "localhost");
        prop.setProperty("dbuser", "mkyong");
        prop.setProperty("dbpassword", "password");
        Configuration.writeConfigurationToFile(prop, "newpos.ini");

        prop=Configuration.readConfigurationFromFile("newpos.ini");
        System.out.println(prop.getProperty("database"));
        System.out.println(prop.getProperty("dbuser"));
        System.out.println(prop.getProperty("dbpassword"));

prop.setProperty("dbpassword", "1235");
Configuration.writeConfigurationToFile(prop, "newpos.ini");


prop=Configuration.readConfigurationFromFile("newpos.ini");
System.out.println(prop.getProperty("database"));
System.out.println(prop.getProperty("dbuser"));
System.out.println(prop.getProperty("dbpassword"));

Configuration.resetProperty("newpos.ini", "dbuser", "n1231");
prop=Configuration.readConfigurationFromFile("newpos.ini");
System.out.println(prop.getProperty("database"));
System.out.println(prop.getProperty("dbuser"));
System.out.println(prop.getProperty("dbpassword"));

    }
}
