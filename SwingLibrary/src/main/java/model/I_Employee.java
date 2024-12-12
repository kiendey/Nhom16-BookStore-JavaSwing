package model;

import java.util.List;

public interface I_Employee<T> {
    public List<T> selectAll();
    public Employee selectById(int id);
    public Employee selectByName(String name);
    public boolean insert(Employee employee); ;
    public boolean update(Employee employee);
    public boolean delete(int id);
}
