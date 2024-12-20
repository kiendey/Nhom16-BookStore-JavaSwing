package controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import jakarta.persistence.Query;
import model.Book;
import model.I_Statitic;
import model.PurchaseInvoice;
import model.Statistic;
import util.HibernateUtil;

public class Statitic_DAO implements I_Statitic{
	@Override
    public List<?> selectAll() {
        List<?> list = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                Query query = session.createQuery("from Statistic ", Statistic.class);
                list = query.getResultList();
                transaction.commit();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    @Override
    public Statistic selectById(int id) {
    	 try {
             SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             if (sessionFactory != null) {
                 Session session = sessionFactory.openSession();
                 Transaction transaction = session.beginTransaction();
                 Query query = session.createQuery("from Statistic where id = :id", Statistic.class);
                 query.setParameter("id", id);
                 Statistic s = (Statistic) query.getSingleResult();
                 transaction.commit();
                 return s;
             }
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
        return null;
    }

    @Override
    public Statistic selectByName(String name) {
        return null;
    }

    @Override
    public boolean insert(Statistic statistic) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                session.merge(statistic);
                transaction.commit();
                return true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
		return false;
    }


	@Override
	public boolean update(Statistic statistic) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                session.merge(statistic);
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
                Statistic b = (Statistic) session.get(Statistic.class, id);
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
