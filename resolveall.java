//Name: Nikhil Sethi
//ID: 1213414
//Assignment one

import java.net.InetAddress;
import java.net.*;

public class resolveall
{
	public static void main (String args[])
	{
		int i;
		String address;
		if(args.length == 0)
		{
			//Need to put the argument in the right format
			System.out.println("Usage: resolve <name> <name2> ... <nameN>");
		}
		else
			{
				for (i = 0; i < args.length; i++)
				{
					address = args[i];
					try
					{
						//getAllByName gets the IPv6 address of the host as well
						//and it provides the IPv4 address 
						InetAddress[] ip = InetAddress.getAllByName(address);
						for (InetAddress ipAdd: ip)
							//Then it prints out the IPv6 and IPv4 Adress and DNS 
							System.out.println(address + " : " + ipAdd.getHostAddress());
					}
					catch (Exception e)
					{
						//Prints an error if Host provided is not identified. 
						System.err.println(address + " Unknown Host");
					}
				}
			}
	}
	
}

