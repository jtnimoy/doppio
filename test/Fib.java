// compute fibonacci sequence
package test;
public class Fib {
  static long fib(long n) {
    if (n < 2) return 1;
    return fib(n-1) + fib(n-2);
  }
  public static void main(String[] args) {
  	if (args.length > 0) {
    	int n = Integer.parseInt(args[0]);
    	System.out.println("fib("+n+") = "+fib(n));
    } else {
    	System.out.println("usage: java Fib <number>");
    }
  }
}