package pairProgramming;
import java.util.Scanner;
public class IntToEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
	}
	
	static String translateEng(int n) {
		String[] num = String.valueOf(n).split("");
		String ichinokurai;
		if(num.length==1){
			if(num[0]=="0"){
				ichinokurai="zero";
			}
			 ichinokurai=ichinokurai(num[0]);
			
		}
		
		
		return "";
	}
      static String ichinokurai(String num){
    	  if(num=="0") return "";
    	  if(num=="1") return "one";
    	  if(num=="2") return "two";
    	  if(num=="3") return "three";
    	  if(num=="4") return "four";
    	  if(num=="5") return "five";
    	  if(num=="6") return "six";
    	  if(num=="7") return "seven";
    	  if(num=="8") return "eight";
    	  if(num=="9") return "nine";
    	  
    	  return"";
      }
      
    	  
    	 
    	  
      }

