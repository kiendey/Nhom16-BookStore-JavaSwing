package controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import model.Book;
import model.Employee;
import model.I_Book;
import util.HibernateUtil;

@SuppressWarnings("rawtypes")
public class Book_DAO implements I_Book{

	@Override
    public List<?> selectAll() {
        List<?> list = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                Query query = session.createQuery("from Book ", Book.class);
                list = query.getResultList();
                transaction.commit();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    @Override
    public Book selectById(int id) {
    	 try {
             SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             if (sessionFactory != null) {
                 Session session = sessionFactory.openSession();
                 Transaction transaction = session.beginTransaction();
                 Query query = session.createQuery("from Book where id = :id", Book.class);
                 query.setParameter("id", id);
                 Book book = (Book) query.getSingleResult();
                 transaction.commit();
                 return book;
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
                List<Book> list = session.createQuery("FROM Book WHERE name LIKE :name", Book.class) .setParameter("name", "%" + name + "%") .getResultList();
                transaction.commit();
                return list;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       return null;
    }

    @Override
    public boolean insert(Book book) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                session.merge(book);
                transaction.commit();
                return true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
		return false;
    }


	@Override
	public boolean update(Book book) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                session.merge(book);
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
                Book b = (Book) session.get(Book.class, id);
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

