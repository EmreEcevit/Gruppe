package Otahal;

import java.util.*;

public class Zahlen <T extends Comparable <? super T>>
{
	private int sum;
	private int max;
	private int min;
	private Zahlen<T> head;
	Zahlen<T> next;
	Zahlen<T> prev;
	T data;
	private LinkedList<Integer> MyList;
	Integer maxi = Collections.max(MyList);
	Integer mini = Collections.min(MyList);
	public Zahlen (int zahl){
		this.MyList = new LinkedList<>();
		this.MyList.add(zahl);
	}
	
	public void add (int zahle)
	{
		MyList.add(zahle);
	}
	
	public void getmax(int max)
	{
		this.max = max;
	}

	public void getmini (int min)
	{
		this.min = min;
	}
	T getData()
    {
        return data;
    }
	public void setNext(Zahlen<T> _next)
    {
        next = _next;
    }

    public void setPrev(Zahlen<T> _prev)
    {
        prev = _prev;
    }

    public Zahlen<T> getNext()
    {
        return next;
    }

    public Zahlen<T> getPrev()
    {
        return prev;
    }
	public T getMin() {
	    Zahlen<T> temp = head.getNext();
	    T min = head.getData();
	    while(temp != null) {
	        T candidateValue = temp.getData();
	        if (candidateValue.compareTo(min) < 0) { // equivalent to candidate < min
	            min = candidateValue;
	        }
	        temp = temp.getNext();
	    }
	    return min;
	}
	
	public T getMax() {
	    Zahlen<T> temp = head.getNext();
	    T max = head.getData();
	    while(temp != null) {
	        T candidateValue = temp.getData();
	        if (candidateValue.compareTo(max) > 0) { // equivalent to candidate > max
	            max = candidateValue;
	        }
	        temp = temp.getNext();
	    }
	    return max;
	}
	public int sum(List<Integer> intList) {
		 int result = 0;
		 for(int i=0;i<intList.size();i++)
		 result += intList.get(i).intValue();
		 return result;
		 }
	
}
