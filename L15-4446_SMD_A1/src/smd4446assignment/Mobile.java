
package smd4446assignment;

public abstract class Mobile {
       
     public int  modelNo;
     public int ramsize;
     public String color;
     
     Mobile()
     {
         
     }
     public void setvalues(int mno,int ramsize,String color)
     {
         this.modelNo=mno;
         this.color=color;
         this.ramsize=ramsize;
     }
     // abstract 
     public abstract void displyDiscription();
         
       public String NokiaMade()
       {
            return "Nokia";
       }
       
       public String SamsungMade(){
           return "Samsung";
       }
       
        public String IphoneMade(){
            return "Iphone";
        }
}
