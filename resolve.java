//Name: Nikhil Sethi
//ID: 1213414
//Assignment one

import java.net.InetAddress;
import java.net.*;

public class resolve 
{
	//InetAddress allows us to track the IPv4 and IPv6 address of the host
	public static void main (String args[])
	{
		int i;
		String address;
		//Allow user to pass an argument as a string 
		if(args.length == 0)
		{
			//prints out this if the length of passed argument is empty
			System.out.println("Usage: resolve <name> <name2> ... <namen>");
		}
		else
			{
				for (i = 0; i < args.length; i++)
				{
					address = args[i];
					try
					{
						//getByName resolve the address with DNS
						//It prints out the Host IP address when user pass an argument of any webserver
						InetAddress ip = InetAddress.getByName(address);
						System.out.println(address + ": " + ip.getHostAddress());
					}
					catch (Exception e)
					{
						//If address is not appropriate then an error is pinted
						System.err.println(address + " Unknown Host");
					}
				}
			}
	}
	
}

