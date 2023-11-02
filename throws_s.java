import java.io.*;
public class throws_s {

	  public static void main(String[] args) {
		     try{
		           FileWriter file = new FileWriter("c:\\Data1.txt");
		           file.write("Guru99");
		           file.close();
		    }
		    catch(IOException e){
		        System.out.println(e);
		    }
		  }
}
