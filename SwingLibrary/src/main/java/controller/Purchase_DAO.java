package controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import jakarta.persistence.Query;
import model.Book;
import model.Employee;
import model.I_Purchase;
import model.PurchaseInvoice;
import util.HibernateUtil;

public class Purchase_DAO implements I_Purchase{

	@Override
    public List<?> selectAll() {
        List<?> list = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                Query query = session.createQuery("from PurchaseInvoice ", PurchaseInvoice.class);
                list = query.getResultList();
                transaction.commit();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    @Override
    public PurchaseInvoice selectById(int id) {
    	 try {
             SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             if (sessionFactory != null) {
                 Session session = sessionFactory.openSession();
                 Transaction transaction = session.beginTransaction();
                 Query query = session.createQuery("from PurchaseInvoice where id = :id", PurchaseInvoice.class);
                 query.setParameter("id", id);
                 PurchaseInvoice p = (PurchaseInvoice) query.getSingleResult();
                 transaction.commit();
                 return p;
             }
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
        return null;
    }

    @Override
    public PurchaseInvoice selectByName(String name) {
        return null;
    }

    @Override
    public boolean insert(PurchaseInvoice purchaseInvoice) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                session.merge(purchaseInvoice);
                transaction.commit();
                return true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
		return false;
    }


	@Override
	public boolean update(PurchaseInvoice purchaseInvoice) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                session.merge(purchaseInvoice);
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
                PurchaseInvoice b = (PurchaseInvoice) session.get(PurchaseInvoice.class, id);
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
