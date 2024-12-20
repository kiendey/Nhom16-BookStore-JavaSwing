package controller;

import jakarta.persistence.*;
import model.Book;
import model.Employee;
import model.I_Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

@SuppressWarnings("rawtypes")
public class Employee_DAO implements I_Employee {
    @Override
    public List<?> selectAll() {
        List<?> list = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                Query query = session.createQuery("from Employee ", Employee.class);
                list = query.getResultList();
                transaction.commit();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public Employee selectById(int id) {
    	 try {
             SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             if (sessionFactory != null) {
                 Session session = sessionFactory.openSession();
                 Transaction transaction = session.beginTransaction();
                 Query query = session.createQuery("from Employee where id = :id", Employee.class);
                 query.setParameter("id", id);
                 Employee employee = (Employee) query.getSingleResult();
                 transaction.commit();
                 return employee;
             }
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
        return null;
    }

    @Override
    public List<?> selectByName(String name) {
    	try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                List<Employee> list = session.createQuery("FROM Employee WHERE name LIKE :name", Employee.class) .setParameter("name", "%" + name + "%") .getResultList();
                transaction.commit();
                return list;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       return null;
    }

    @Override
    public boolean insert(Employee employee) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                session.merge(employee);
                transaction.commit();
                return true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
		return false;
    }


    @Override
    public boolean update(Employee employee) {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                session.merge(employee);
                transaction.commit();
                return true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
		return false;
    }

    @Override
    public boolean delete(int id) {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                Employee b = (Employee) session.get(Employee.class, id);
                if (b!= null) {
	                session.remove(b);
	                transaction.commit();
	                return true;
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
		return false;
    }
}
