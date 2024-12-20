package model;

import java.util.List;

public interface I_Book<T> {
    public List<T> selectAll();
    public Book selectById(int id);
    public List<T> selectByName(String name);
    public boolean insert(Book book); ;
    public boolean update(Book book);
    public boolean delete(int id);
}
