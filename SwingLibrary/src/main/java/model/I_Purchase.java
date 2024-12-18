package model;

import java.util.List;

public interface I_Purchase<T> {
    public List<T> selectAll();
    public PurchaseInvoice selectById(int id);
    public PurchaseInvoice selectByName(String name);
    public boolean insert(PurchaseInvoice purchaseInvoice); 
    public boolean update(PurchaseInvoice purchaseInvoice);
    public boolean delete(int id);
}
