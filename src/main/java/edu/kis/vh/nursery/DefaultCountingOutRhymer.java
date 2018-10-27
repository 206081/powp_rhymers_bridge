package edu.kis.vh.nursery;
import edu.kis.vh.nursery.collections.IntLinkedList;
import edu.kis.vh.nursery.collections.StackImpementation;

public class DefaultCountingOutRhymer {

	private final StackImpementation stackImplementation;
	
	public DefaultCountingOutRhymer(StackImpementation stackImplementation) {
		this.stackImplementation = stackImplementation;
	}

	public DefaultCountingOutRhymer() {
		stackImplementation = new IntLinkedList();
	}

	public int getTotal() {
		return stackImplementation.getSize();
	}

	public void countIn(int in) {
		stackImplementation.push(in);
	}

	boolean isFull() {
		return stackImplementation.isFull();
	}

	int peekaboo() {
		return stackImplementation.top();
	}

	int countOut() {
		return stackImplementation.pop();
	}

	boolean callCheck() {
		return stackImplementation.isEmpty();
	}
}
