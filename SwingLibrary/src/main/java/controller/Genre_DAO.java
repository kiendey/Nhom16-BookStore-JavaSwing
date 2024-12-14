package controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import jakarta.persistence.Query;
import model.Genre;
import model.I_Genre;
import util.HibernateUtil;

@SuppressWarnings("rawtypes")
public class Genre_DAO implements I_Genre<Genre> {

	@Override
	public List<Genre> selectAll() {
		List list = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				Query query = session.createQuery("from Genre ", Genre.class);
				list = query.getResultList();
				transaction.commit();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	@Override
	public List<String> selectAllName() {
		List<String> list = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				Query query = session.createQuery("SELECT g.name FROM Genre g", Genre.class);
				list = query.getResultList();
				transaction.commit();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	@Override
	public Genre selectById(int id) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				Query query = session.createQuery("from Genre where id = :id", Genre.class);
				query.setParameter("id", id);
				Genre genre = (Genre) query.getSingleResult();
				transaction.commit();
				return genre;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public Genre selectByName(String name) {
		return null;
	}

	@Override
	public boolean insert(Genre genre) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			try (Session session = sessionFactory.openSession()) {
				Transaction transaction = session.beginTransaction();
				session.merge(genre);
				transaction.commit();
				return true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return false;
	}

	@Override
	public boolean update(Genre genre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
