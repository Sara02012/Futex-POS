

package pos;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class Configuration {

    
   public static void writeConfigurationToFile(Properties prop, String fileName)
   {
       try {

    		//save properties to project root folder
    		prop.store(new FileOutputStream(fileName), null);

    	} catch (IOException ex) {
    		System.out.println(ex.getMessage());
        }


   }


   public static Properties readConfigurationFromFile(String fileName)
   {
       Properties prop=new  Properties();
       try {
               //load a properties file
    		prop.load(new FileInputStream(fileName));


    	} catch (IOException ex) {
    		ex.printStackTrace();
        }

       return prop;

   }

   public static void resetProperty(String fileName, String prpertyTitle, String propertyValue)
   {
       Properties prop=new  Properties();
       try {
               //load a properties file
    		prop.load(new FileInputStream(fileName));



    	} catch (IOException ex) {
    		ex.printStackTrace();
        }


       try {

                prop.setProperty(prpertyTitle, propertyValue);
                
    		//save properties to project root folder
    		prop.store(new FileOutputStream(fileName), null);

    	} catch (IOException ex) {
    		System.out.println(ex.getMessage());
        }
   }



}
