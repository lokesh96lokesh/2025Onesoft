package Day2;

public class Method14 {
public static void main(String[]args) {
	String a= "java,phython,c++";
	String[] b=a.split(",");
	System.out.println(b[1]);
	String val=a.substring(0,4);
	System.out.println(val);
	String val1=a.substring(5,12);
	System.out.println(val1);
	String val2=a.substring(13);
	System.out.println(val2);
	int lengt=val.length();
	System.out.println(lengt);
	
}
}
