package tetris.model;

import java.util.List;

public interface IDAO <T, I> {
 public T save(T o, int d);
 public boolean delete(T o);
 public T find(T o, I nom);
 public List<T> findAll();

}
