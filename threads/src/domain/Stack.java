package domain;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	
	private List<Character> buffer = new ArrayList<>();
	
	
	public synchronized void push(char c) {
		this.notify();
		buffer.add(c);
	}

	public synchronized char pop() {
		char c;
		while ( buffer.size() == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		c = buffer.remove(buffer.size() - 1);
		return c;
	}
}
