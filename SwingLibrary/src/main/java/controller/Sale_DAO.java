package controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import jakarta.persistence.Query;
import model.I_Sale;
import model.PurchaseInvoice;
import model.SalesInvoice;
import util.HibernateUtil;

public class Sale_DAO implements I_Sale{

	@Override
    public List<?> selectAll() {
        List<?> list = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                Query query = session.createQuery("from SalesInvoice ", SalesInvoice.class);
                list = query.getResultList();
                transaction.commit();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    @Override
    public SalesInvoice selectById(int id) {
    	 try {
             SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             if (sessionFactory != null) {
                 Session session = sessionFactory.openSession();
                 Transaction transaction = session.beginTransaction();
                 Query query = session.createQuery("from SalesInvoice where id = :id", SalesInvoice.class);
                 query.setParameter("id", id);
                 SalesInvoice s = (SalesInvoice) query.getSingleResult();
                 transaction.commit();
                 return s;
             }
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
        return null;
    }

    @Override
    public SalesInvoice selectByName(String name) {
        return null;
    }

    @Override
    public boolean insert(SalesInvoice salesInvoice) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                session.merge(salesInvoice);
                transaction.commit();
                return true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
		return false;
    }


	@Override
	public boolean update(SalesInvoice salesInvoice) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
}
