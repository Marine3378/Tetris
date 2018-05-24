package tetris.model;

import java.util.List;

public interface IDAO <T> {
 public T save(T o);
 public boolean delete(T o);
 public T findById(int id);
 public List<T> findAll();

}
