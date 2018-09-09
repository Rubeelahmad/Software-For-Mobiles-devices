
package smd4446assignment;

public class SMD4446Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       try{
	    Mobile myCellphone=new  Tochscreen(420,"pinki",64 ,4446);
           myCellphone.displyDiscription();
	}
        catch(Exception e){
	   System.out.println("There is Some Exception Occure in your Code");
	}
        
       
    }
    
}
