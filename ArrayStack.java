//----------------------------------------------------------------
// ArrayStack.java       by Dale/Joyce/Weems             Chapter 3
//
// Implements BoundedStackInterface using an array to hold the
// stack elements.
//
// Two constructors are provided: one that creates an array of a
// default size and one that allows the calling program to
// specify the size.
//----------------------------------------------------------------

package ch03.stacks;

public class ArrayStack<T> implements BoundedStackInterface<T>
{
  protected final int DEFCAP = 100; // default capacity
  protected T[] stack;              // holds stack elements
  protected int topIndex = -1;      // index of top element in stack
  protected int loc;				// used in inspector method to return location
  protected int count;				// used in the popSome method that pushes a certain number of elements

public ArrayStack()
  {
    stack = (T[]) new Object[DEFCAP];
  }

  public ArrayStack(int maxSize)
  {
    stack = (T[]) new Object[maxSize];
  }

  public void push(T element)
  // Throws StackOverflowException if this stack is full,
  // otherwise places element at the top of this stack.
  {
    if (!isFull())
    {
      topIndex++;
      stack[topIndex] = element;
    }
    else
      throw new StackOverflowException("Push attempted on a full stack.");
  }

  public void pop()
  // Throws StackUnderflowException if this stack is empty,
  // otherwise removes top element from this stack.
  {
    if (!isEmpty())
    {
      stack[topIndex] = null;
      topIndex--;
    }
    else
      throw new StackUnderflowException("Pop attempted on an empty stack.");
  }

  public T top()
  // Throws StackUnderflowException if this stack is empty,
  // otherwise returns top element from this stack.
  {
    T topOfStack = null;
    if (!isEmpty())
      topOfStack = stack[topIndex];
    else
      throw new StackUnderflowException("Top attempted on an empty stack.");
    return topOfStack;
  }

  public boolean isEmpty()
  // Returns true if this stack is empty, otherwise returns false.
  {
    if (topIndex == -1)
      return true;
    else
      return false;
  }

  public boolean isFull()
  // Returns true if this stack is full, otherwise returns false.
  {
    if (topIndex == (stack.length - 1))
      return true;
    else
      return false;
  }

  public T inspector(int loc){
	  if( loc <= topIndex)
	  {
		  return stack[loc];
	  }
	return null;
  }


  public void popSome(int count) {
		if (count <= stack.length)
		{
			for(int i = 0; i < count; i++)
			pop();
		}
		else
		{
			throw new StackUnderflowException("Not enough objects to pop");
		}
	}


  public int size() {
	  int newSize = 0;
	  while(newSize < topIndex) {
		  newSize++;
	  }
	  newSize = newSize + 1;
	  return newSize;
  }





}
