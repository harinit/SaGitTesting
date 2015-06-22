
package git.sample;

import java.io.IOException;

/**
 * @author 282026
 *
 */
public class AdditionStack {
	static int num;
	static int ans;
	static Stack theStack;

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		num = 50;
		stackAddition();
		System.out.println("Sum=" + ans);
		System.out.println("This is for testing purpose" );
	}

	public static void stackAddition() {
		theStack = new Stack(10000);
		ans = 0;
		while (num > 0) {
			theStack.push(num);
			--num;
		}
		while (!theStack.isEmpty()) {
			int newN = theStack.pop();
			ans += newN;
		}
	}
}
