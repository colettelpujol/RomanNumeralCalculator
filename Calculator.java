import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a Roman Numeral using capital letters");
		String rNum = scan.nextLine();
		System.out.println(rNum + " = " + romanToInt(rNum));

	}
    public static int romanToInt(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'M'){
                sum += 1000;
                continue;
            }
            if(s.charAt(i) == 'D'){
                sum += 500;
                continue;
            }
            if(s.charAt(i) == 'C' && ((i+1) < s.length())){
                if(s.charAt(i+1) == 'M'){
                    sum +=900;
                    i++;
                    continue;
                } else if (s.charAt(i+1) == 'D'){
                    sum += 400;
                    i++;
                    continue;
                } else {
                    sum += 100;
                    continue;
                } 
            } else if(s.charAt(i) == 'C'){
                sum += 100;
                continue;
            }
            
            if(s.charAt(i) == 'L'){
                sum += 50;
                continue;
            }
            if(s.charAt(i) == 'X' && (i+1) < s.length()){
                if(s.charAt(i+1) == 'C'){
                    sum +=90;
                    i++;
                    continue;
                } else if (s.charAt(i+1) == 'L'){
                    sum += 40;
                    i++;
                    continue;
                } else {
                    sum += 10;
                    continue;
                }
            } else if(s.charAt(i) == 'X'){
                sum += 10;
                continue;
            }
            if(s.charAt(i) == 'V'){
                sum += 5;
                continue;
            }
            if(s.charAt(i) == 'I' && (i+1) < s.length()){
                if(s.charAt(i+1) == 'X'){
                    sum +=9;
                    i++;
                    continue;
                } else if (s.charAt(i+1) == 'V'){
                    sum += 4;
                    i++;
                    continue;
                } else {
                    sum += 1;
                    continue;
                }
            } else if(s.charAt(i) == 'I'){
                sum += 1;
                continue;
            }
            
        }
        return sum;
    }

}
