package edu.kis.vh.nursery.collections;

public interface StackImplementation {

	int EMPTY_STACK = 0;
	int STACK_CAPACITY = 12;
	/**
	 * Check if list is full.
	 *
	 * @return always false.
	 */
	boolean isFull();

	/**
	 * Add integer to end of the stack.
	 *
	 * @param i - integer to add.
	 */
	void push(int i);

	/**
	 * Check if list is empty.
	 *
	 * @return true if stack is empty otherwise false.
	 */
	boolean isEmpty();

	/**
	 * Get value from last added element to stack.
	 *
	 * @return value of last element of stack.
	 */
	int top();

	/**
	 * Pop out value from top of the list. 
	 *
	 * @return last element of stack if stack is not empty otherwise return -1
	 */
	int pop();

	int getSize();

}