package vn.kiendey.SwingLibrary;

import controller.Book_DAO;
import controller.Employee_DAO;
import controller.Genre_DAO;
import controller.Purchase_DAO;
import model.Book;
import model.Employee;
import model.Genre;
import model.PurchaseInvoice;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Employee employee01 = new Employee(1, "Hương", 20, "Nam Định", "01234", "thuhuong@gmail.com");
        Book book01 = new Book(1, "Conan", "Trinh thám", "kim Đồng", "Aoyama Gosho", "14-12-2004");
        Genre genre =  new Genre(1, "Trinh thám");
        Employee_DAO employeeDao = new Employee_DAO();
//        employeeDao.insert(employee01);
        Book_DAO bookDao = new Book_DAO();
//        bookDao.insert(book01);
        Genre_DAO genreDao = new Genre_DAO();
//        genreDao.insert(genre);
        List<Genre> list =  genreDao.selectAll();
        PurchaseInvoice purchaseInvoice = new PurchaseInvoice(1, "17-12-2009", "Trung Kiên", "Bạch dạ hành", 10, 50000, 500000);
        Purchase_DAO purchaseDao = new Purchase_DAO();
        purchaseDao.insert(purchaseInvoice);
        List<PurchaseInvoice> l= (List<PurchaseInvoice>) purchaseDao.selectAll();
        for (PurchaseInvoice p: l) {
            System.out.println(p.getId());
        }
    }
}
