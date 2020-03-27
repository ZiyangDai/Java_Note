import java.io.*;
public class CircleAreaUserInput{
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(
                          new InputStreamReader(System.in)); //BufferedReader
        String r;
        double S = 0; // define r(radius) and S(area)
    
        System.out.println("Please enter the radius of the circle: "); 
        
        try{ //use 'try & catch' to do exception handling
        r = buf.readLine(); 
        int radius = Integer. parseInt (r);  // String to integer  
        S = Math.PI*radius*radius;  //Circle area
        }

        catch(NumberFormatException e) {
        System.out.println("You need to enter an integer number!");
        }
        catch(IOException e){
        }         
        System.out.println("The area is " + S);
    }
}
