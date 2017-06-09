package pl.sdacademy.stack;

import java.util.Iterator;

public class List<T> implements IList<T> {

	ListElement<T> pierwszyElement;
	ListElement<T> ostatniElement;

	public List() {
		pierwszyElement = null;
		ostatniElement = null;
	}

	@Override
	public T getFirst() {
		return pierwszyElement.getValue();
	}

	@Override
	public T getLast() {
		return ostatniElement.getValue();
	}

	@Override
	public T get(int index) {

		int iterator = 0;
		ListElement<T> element = null;
		if (!isEmpty()) {
			element = pierwszyElement;
			while (iterator != index) {
				element = element.getNext();
				iterator++;
			}
		}
		return element.getValue();

	}

	@Override
	public void add(Object value) {
		ListElement<T> dodawanyElement = new ListElement<T>((T) value);
		if (isEmpty()) {
			pierwszyElement = dodawanyElement;
			ostatniElement = dodawanyElement;
		} else {
			ostatniElement.setNext(dodawanyElement);
			dodawanyElement.setPrevious(ostatniElement);
			ostatniElement = dodawanyElement;
		}

	}

	@Override
	public void remove(int index) {
		int iterator = 0;
		ListElement<T> element = pierwszyElement;
		while (iterator != index) {
			element = element.getNext();
			iterator++;
		}
		
		ListElement<T> previousElement = element.getPrevious();
		ListElement<T> afterElement = element.getNext();
		if (afterElement==null){
			ostatniElement = previousElement;
			ostatniElement.setNext(null);
					
		} else {
		previousElement.setNext(afterElement);
		afterElement.setPrevious(previousElement);
		}
	}

	@Override
	public int size() {
		int iterator = -1;
		if (!isEmpty()) {
			ListElement<T> element = pierwszyElement;
			while (element != null)
				iterator++;
			element = element.getNext();
		}
		return iterator;

	}

	@Override
	public boolean isEmpty() {
		return pierwszyElement == null;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
