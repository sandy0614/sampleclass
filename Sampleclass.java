public class Sampleclass{
private String msg;

public void setMsg(String msg){
this.msg = msg;
}
public String getMsg(){
return msg;
}

public static void main(String[] args){
 Sampleclass h = new Sampleclass();
 h.setMsg("Welcome to Jenkins World");
 System.out.println(h.getMsg());
 }
 }
 
