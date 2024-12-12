package vn.kiendey.SwingLibrary;

import controller.Book_DAO;
import controller.Employee_DAO;
import model.Book;
import model.Employee;

public class Test {
    public static void main(String[] args) {
        Employee employee01 = new Employee(1, "Hương", 20, "Nam Định", "01234", "thuhuong@gmail.com");
        Book book01 = new Book(1, "Conan", "Trinh thám", "kim Đồng", "Aoyama Gosho", "14-12-2004");
        Employee_DAO employeeDao = new Employee_DAO();
        employeeDao.insert(employee01);
        Book_DAO bookDao = new Book_DAO();
        bookDao.insert(book01);
    }
}
