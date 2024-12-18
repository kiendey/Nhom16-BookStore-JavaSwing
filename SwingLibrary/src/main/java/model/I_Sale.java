package model;

import java.util.List;

public interface I_Sale<T> {
    public List<T> selectAll();
    public SalesInvoice selectById(int id);
    public SalesInvoice selectByName(String name);
    public boolean insert(SalesInvoice salesInvoice); 
    public boolean update(SalesInvoice salesInvoice);
    public boolean delete(int id);
}