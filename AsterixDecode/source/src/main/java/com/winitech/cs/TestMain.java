package com.winitech.cs;

import java.util.List;
import java.util.Map;

import com.winitech.cs.asterix.ASTERIXDecoder;

public class TestMain {

	public static void main(String[] args) {
		
		String val = "15002AFB8153060181402097AF18006AD4E00068AD4071BF2300000800000000042338C31E60008A4782";
		byte[] ByteArray = hexStringToByteArray(val);
		
		// TODO Auto-generated method stub
		ASTERIXDecoder decoder = new ASTERIXDecoder();
	    List<Map<String,String >> result1 = decoder.decode(ByteArray);
	    List<Map<String,String >> result2 = decoder.decode(ByteArray);
	    List<Map<String,String >> result3 = decoder.decode(ByteArray);
	    List<Map<String,String >> result4 = decoder.decode(ByteArray);
	    List<Map<String,String >> result5 = decoder.decode(ByteArray);
	    
	    System.out.println(result5);
	    
	}
	
	public static byte[] hexStringToByteArray(String s) {
	    int len = s.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
	                             + Character.digit(s.charAt(i+1), 16));
	    }
	    return data;
	}

}
