package hundred_programs;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class IPAddress {

	public static void localIpAddress() throws UnknownHostException
	{
		System.out.println(Inet4Address.getLocalHost());
		
	}
	public static void main(String[] args) throws UnknownHostException {
 
		 IPAddress.localIpAddress();
		
	}

}
