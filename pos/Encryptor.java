/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.security.MessageDigest;

/**
 *
 * @author PC1
 */
public class Encryptor {
    
    public static String Encrypt(String value)
    {
        try{
    	
 
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(value.getBytes());
 
        byte byteData[] = md.digest();
 
 
        //convert the byte to hex format method 2
        StringBuffer hexString = new StringBuffer();
    	for (int i=0;i<byteData.length;i++) {
    		String hex=Integer.toHexString(0xff & byteData[i]);
   	     	if(hex.length()==1) hexString.append('0');
   	     	hexString.append(hex);
    	}
        
        String EncodedString=new String(hexString);
    	return EncodedString;
        
        }catch(Exception ex){
            
        }
        return value;
    }
    
    
    public static boolean compare(String firstValue, String secondValue)
    {
        
        if(firstValue.equals(secondValue))
            return true;
        else
            return false;
        
        
    }
    
}
