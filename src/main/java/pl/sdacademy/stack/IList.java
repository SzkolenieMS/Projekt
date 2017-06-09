package pl.sdacademy.stack;


public interface IList<T> extends Iterable<T> {
	   T getFirst();
	   T getLast();
	   T get(int index);
	   void add(Object value);
	   void remove(int index);
	   int size();
	   boolean isEmpty();
	}
