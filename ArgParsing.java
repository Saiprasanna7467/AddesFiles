package basicprograms;

public class ArgParsing {
	
		void meth(int i, int j) {
		i *= 2;
		j /= 2;
		}
		}
		class CallByValue {
		public static void main(String args[]) {
		ArgParsing ob = new ArgParsing();
		int a = 15, b = 20;
		System.out.println("a and b before call: " +
		a + " " + b);
		ob.meth(a, b);
		System.out.println("a and b after call: " +
		a + " " + b);
		}
		}

