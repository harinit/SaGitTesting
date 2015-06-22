package git.sample;

class Stack {
	private int maxSize;
	private int[] data;
	private int top;

	public Stack(int s) {
		maxSize = s;
		data = new int[maxSize];
		top = -1;
	}

	public void push(int p) {
		data[++top] = p;
	}

	public int pop() {
		return data[top--];
	}

	public int peek() {
		return data[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}
}
