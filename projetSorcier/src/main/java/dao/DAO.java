package dao;

import java.util.*;

public interface DAO<T, K> {

	public void insert(T object);
	public T selectById (K id);
	public void update(T object);
	public void delete(T object);
}