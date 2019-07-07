package Data_Structure_and_Algorithms.Stacks;

public interface Stack<E> {

    /**
     * Returns the number of the elements in the stack.
     * @return number of elements in the stack
     */
    int size();

    /**
     * Tests whether the stack is empty.
     * @return true if stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Inserts an element at the top of the stack.
     * @param e the element to be inserted
     */
    void push(E e);

    /**
     * Returns but does not remove, the element at the top the stack.
     * @return top element in the stack (or null if empty)
     */
    E top();

    /**
     * Removes and returns the top element from the stack.
     * @return element removed (or null if empty)
     */
    E pop();


}
