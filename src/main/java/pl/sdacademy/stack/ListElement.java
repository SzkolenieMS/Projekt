package pl.sdacademy.stack;

import java.util.Iterator;

public class ListElement<T>  {
	T value;
	ListElement<T> next;
	ListElement<T> previous;
	
	public ListElement(T value) {
		super();
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public ListElement<T> getNext() {
		return next;
	}
	public void setNext(ListElement<T> next) {
		this.next = next;
	}
	public ListElement<T> getPrevious() {
		return previous;
	}
	public void setPrevious(ListElement<T> previous) {
		this.previous = previous;
	}
}
