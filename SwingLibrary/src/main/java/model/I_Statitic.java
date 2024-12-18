package model;

import java.util.List;

public interface I_Statitic<T> {
    public List<T> selectAll();
    public Statistic selectById(int id);
    public Statistic selectByName(String name);
    public boolean insert(Statistic statistic); ;
    public boolean update(Statistic statistic);
    public boolean delete(int id);
}
