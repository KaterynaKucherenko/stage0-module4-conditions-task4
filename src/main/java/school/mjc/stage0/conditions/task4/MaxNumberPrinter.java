package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
if (first >= second && first >= third){
	            System.out.println(first);}
	    if (second > third && second > first){
	            System.out.println(second);}
	    if (third > second && third > first){
	            System.out.println(third);}
    }
}
