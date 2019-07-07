package Data_Structure_and_Algorithms.Stacks;

public class ArrayStack<E> implements Stack<E> {

    public static final int CAPACITY = 1000; // default array capacity
    private E[] data; // generic array used for storage
    private int t = -1; // index of the top element in stack

    public  ArrayStack() { // constructs stack with default capacity
        this(CAPACITY);
    }

    public ArrayStack(int capacity) { // constructs stack with given capacity
        data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
    }

    public int size() {return t + 1;}

    public boolean isEmpty() {return  t == - 1;}

    public void push(E e) throws IllegalStateException{
        if (size() == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = e; // increment t before storing new item
    }

    public E top() {
        if (isEmpty()) return null;
        return data[t];
    }

    public E pop() {
        if (isEmpty()) return null;

        E answer = data[t];
        data[t] = null; // dereference to help garbage collection

        t--;

        return answer;
    }

}
