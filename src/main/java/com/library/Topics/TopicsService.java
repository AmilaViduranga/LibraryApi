package com.library.Topics;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.library.Hibernate.DBConfiguration;

@Service
public class TopicsService {
	private SessionFactory sessionFactory = DBConfiguration.getFactory();
	private Session session;
	
	/*
	 * get all the topics from db
	 */
	public List<TopicsModel> getTopics() {
		session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(TopicsModel.class);
		List<TopicsModel> results = null;
		try {
			results = criteria.list();
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			return results;
		}
	}
	
	/*
	 * get specific topic from db
	 * params
	 * @id: id of the object
	 */
	public TopicsModel getTopic(int id) {
		session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(TopicsModel.class);
		TopicsModel instance = new TopicsModel();
		instance.setId(id);
		try {
			instance = (TopicsModel)criteria.add(Restrictions.eq("id", id)).uniqueResult();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			return instance;
		}
	}
	
	/*
	 * create new topic
	 * params
	 * @newTopics:- newly created topic instance
	 */
	public void addTopic(TopicsModel newTopic) {
		session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(newTopic);
			session.flush();
			tx.commit();
		}
		catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
	
	/*
	 * update available instance
	 * params
	 * @topic:- instance that hold new details
	 * @id:- object id
	 */
	public void updateTopic(TopicsModel topic, int id) {
		TopicsModel oldInstance = this.getTopic(id);
		session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			oldInstance.setDescription(topic.getDescription());
			oldInstance.setName(topic.getName());
			session.update(oldInstance);
			session.flush();
			tx.commit();
		}
		catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
	
	/*
	 * delete available instance
	 * params
	 * @id:- id of the instance
	 */
	public void deleteTopic(int id) {
		TopicsModel oldInstance = this.getTopic(id);
		session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(oldInstance);
			session.flush();
			tx.commit();
		}
		catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
}
