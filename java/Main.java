public class Main {
  public static void main(String[] args) {
    System.out.println("WALE-KARIGIDI OLUWASEYIFUNMI - 19CJ025837");
    System.out.println("Square Root of 37 =" +Math.sqrt(37));
    System.out.println("Absolute Value of 3-7 ="+Math.abs(3-7));
    System.out.println("Power of 3,7 =" +Math.pow(3,7));
    System.out.println("Exponent of 3 ="+Math.exp(3));
    System.out.println("Cube root of 37 ="+Math.cbrt(37));
    
 //IF STATEMENT
    
    if (3>7){
      System.out.println("3 is greater than 7");
    }
    else{
      System.out.println("3 is less than 7");
    }
 //TERNARY
    
    double m0 =3;
    double m1 =7;
    String smaller = m1==m0 ? "3 is equal t0 7" : "3 is not equal t0 7";
    System.out.println(smaller);

    smaller = m1>m0 ? "3 is greater than 7" : "3 is not greater than 7";
    System.out.println(smaller);

    smaller = m1<m0 ? "3 is less than 7" : "3 is not less than t0 7";
    System.out.println(smaller);
    
 //SWITCH STATEMENT
    
 int day = 6;
  switch (day){
   case 1 : 
  System.out.println("monday");   
  break;
   case 2 : 
  System.out.println("tuesday");   
  break;
   case 3 : 
  System.out.println("wednesday");   
  break;
   case 4 : 
  System.out.println("thursday");   
  break;
   case 5 : 
  System.out.println("friday");   
  break;
   case 6 : 
  System.out.println("saturday");   
  break;
   case 7 : 
  System.out.println("sunday");   
  break;
   }
  
 int matNo=2;
 switch(matNo){
   case 1:
   System.out.println("M1= 3");
   break;
   case 2:
   System.out.println("M2= 7");
   break;
 }    
//BOOLEAN
    
    int x= 3;
    int y= 7;
    System.out.println(x>y);
    System.out.println(x<y);
    System.out.println(x==y); 
    
//LOGICAL OPERATION
    
    System.out.println(x>y && x<y);
    System.out.println(x>y || x<y);    
    System.out.println(!(x>y && x<y));
//FOR LOOP
    for(int i=0;i<=99;i++){
      if(i==37){
        System.out.println(i);
      }
    }
  }
}