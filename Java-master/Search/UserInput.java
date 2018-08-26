package pkg02.anazitisi;

import java.io.*;
class UserInput{

 public static int getInteger(){
 String line;
 InputStreamReader eisodosString=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(eisodosString);
 try{
 line=br.readLine();
 int i=Integer.parseInt(line);
 return i;
 }
 catch(Exception e) {
 return -1;
 }
}
 public static float getFloat(){
 String line;
 InputStreamReader eisodosString=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(eisodosString);
 try{
 line=br.readLine();
 float i=Float.parseFloat(line);
 return i;
 }
 catch(Exception e){
 return -1;
  }
 }

 public static double getDouble(){
 String line;
 InputStreamReader eisodosString=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(eisodosString);
 try{
 line=br.readLine();
 double i=Double.parseDouble(line);
 return i;
 }
 catch(Exception e){
 return -1;
  }
 }

 public static short getShort(){
 String line;
 InputStreamReader eisodosString=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(eisodosString);
 try{
 line=br.readLine();
 short i=Short.parseShort(line);
 return i;
 }
 catch(Exception e){
 return -1;
 }
}

 public static long getLong(){
 String line;
 InputStreamReader eisodosString=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(eisodosString);
 try{
 line=br.readLine();
 long i=Long.parseLong(line);
 return i;
 }
 catch(Exception e){
 return -1;
 }
}

 public static byte getByte(){
 String line;
 InputStreamReader eisodosString=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(eisodosString);
 try{
 line=br.readLine();
 Byte i=Byte.parseByte(line);
 return i;
 }
 catch(Exception e){
 return -1;
  }
 }

 public static char getChar(){
 char c;
 InputStreamReader eisodosString=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(eisodosString);
 try{
 c=(char)br.read();
 return c;
 }
 catch(Exception e){
 return 'e';
 }
}
 
 public static String getString(){
 String str;
 InputStreamReader eisodosString=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(eisodosString);
 try{
 str=br.readLine();
 return str;
 }
 catch(Exception e){
 return "error";
  }
 }
}





