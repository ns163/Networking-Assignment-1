//Name: Nikhil Sethi
//ID: 1213414
//Assignment one

import java.net.*;
import java.io.*;

public class SimpleServer 
{
	public static void main(String args[])
	{
		try
		{	
			//The server socket is for listening to all the incoming connections
			//The socket(0) binds it to the first free port
			ServerSocket  ss = new ServerSocket(0);
			//LocalPort returns the computer used to accept he conncetion from HTTP
			System.out.println(ss.getLocalPort());

			while (true) 
				{
					//Socket establish the connections between the other network machine
					//connected to internet
					//Clients accepts the request which is recieved by the server
					Socket client = ss.accept();
					PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
					//Gets IPv4 address and DNS of the client 
					writer.println("Hello, "+ client.getInetAddress().getHostName());
					writer.println("your IP address is "+ client.getInetAddress().getHostAddress());
					//Close everything in the end
					writer.close();
					client.close();
				}
		}
		//Prints an error
		catch(Exception e)
		{
			//Prints plus the exception error
			System.err.println("error "+e);
		}
	}
}
