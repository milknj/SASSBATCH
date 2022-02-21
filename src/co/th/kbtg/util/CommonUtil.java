package co.th.kbtg.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CommonUtil {

	public static String getComputerName() {
		try
		{
		    InetAddress addr;
		    addr = InetAddress.getLocalHost();
		    String hostname = addr.getHostName();
		    return hostname;
		}
		catch (UnknownHostException ex)
		{
		    System.out.println("Hostname can not be resolved");
		}
		return null;
	}
}
