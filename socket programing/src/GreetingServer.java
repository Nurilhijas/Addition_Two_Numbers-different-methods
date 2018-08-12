/**
 * 
 */

/**
 * @author Nuril Hijas
 *
 */

  import java.net.*;
  import java.io.*;
  import java.util.Scanner;

   public class GreetingServer extends Thread
  {
   private ServerSocket serverSocket;

    public GreetingServer(int port) throws IOException
   {
    serverSocket = new ServerSocket(port);
     serverSocket.setSoTimeout(100000);
    }

    public void run()	
    {
    while(true)
      {
     try
     {
        System.out.println("Waiting for client on port " +
        serverSocket.getLocalPort() + "...");
        Socket server = serverSocket.accept();
        System.out.println("Just connected to "
              + server.getRemoteSocketAddress());
        DataInputStream in =
              new DataInputStream(server.getInputStream());
   Integer x=in.readInt();
   System.out.println("Hellox");
   Integer y=in.readInt();
    System.out.println("Helloy");

       // System.out.println(x);
        //System.out.println(y);


        Integer sum = ( x + y );
        DataOutputStream out =
             new DataOutputStream(server.getOutputStream());

    //  System.out.println(sum);
        out.write(sum);




        server.close();
     }catch(SocketTimeoutException s)
     {
        System.out.println("Socket timed out!");
        break;
     }catch(IOException e)
     {
        e.printStackTrace();
        break;
     }
    }
   }
     public static void main(String [] args)
       {

  Scanner userInput = new Scanner(System.in);
  System.out.println("Please specify a port number (1~65535): ");
  String port;
  port = userInput.next(); 

  try
  {
     Thread t = new GreetingServer(Integer.parseInt(port));
     t.start();
  }catch(IOException e)
  {
     e.printStackTrace();
     }
    }
      }
