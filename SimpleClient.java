//Name: Nikhil Sethi
//ID: 1213414
//Assignment one

import java.net.*;
import java.io.*;

public class SimpleClient 
{
	public static void main(String args[])
	{
		try
		{
			//Two arguments are passed as arguments 
			//One which is the port number which we get from Server
			//Second is the IP address of the machine 
			//where we need to pass the message
			InetAddress IP = InetAddress.getByName(args[0]);
			int portNumber = Integer.parseInt(args[1]);
			Socket me = new Socket(IP,portNumber);
			//So whatever is the server is trying to say that gets passed in the Client
			//So it prints out two statements which is send by the server and readerLine reads it and 
			//prints it out.
			BufferedReader reader = new BufferedReader(new InputStreamReader(me.getInputStream()));
			String response = reader.readLine();
			String resPonse = reader.readLine();
			System.out.println(response+"\n"+resPonse+"\n");

			me.close(); 

		}
		catch(Exception e)
		{
			//Prints an error
			System.err.println("error "+e);
		}
	}
}
