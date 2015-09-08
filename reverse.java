//Name: Nikhil Sethi
//ID: 1213414
//Assignment one

import java.net.InetAddress;
import java.net.*;

public class reverse 
{
	public static void main (String args[])
	{
		int i;
		String address;
		if(args.length == 0)
		{
			//Need to put the address in right format
			System.out.println("Usage: resolve <name1> <name2> ... <namen>");
		}
		else
			{
				for (i = 0; i < args.length; i++)
				{
					address = args[i];
					try
					{
						//gets the IP address
						InetAddress ip = InetAddress.getByName(address);
						if(ip.getHostName().compareTo(address) == 0)
							//Prints out the host address
							//Prints host name 
						System.err.println(address + ":" + " No Name");
					else
						System.out.println(address + " " + ip.getHostName());
					}
					catch (Exception e)
					{
						//Prints an error if an host is unkown
						System.err.println(address + ":" + " Unknown");
					}
				}
			}
	}
	
}

