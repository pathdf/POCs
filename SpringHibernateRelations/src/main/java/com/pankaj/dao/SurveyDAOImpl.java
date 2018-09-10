package com.pankaj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pankaj.model.Survey;

@Repository("surveyDao")
@Transactional
public class SurveyDAOImpl implements SurveyDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Survey get(int surveyId) {
		
		return (Survey) sessionFactory.getCurrentSession().get(Survey.class,surveyId);
	}

	public List<Survey> listAllSurvey() {
		
		return sessionFactory.getCurrentSession().createCriteria(Survey.class).list();
	}

	public int save(Survey survey) {
		
		return (Integer)sessionFactory.getCurrentSession().save(survey);
	}

	public void update(Survey survey) {
		
		sessionFactory.getCurrentSession().merge(survey);

	}

	public void view(Survey survey) {
		
		sessionFactory.getCurrentSession().merge(survey);
	}

	public void delete(int surveyId) {

		sessionFactory.getCurrentSession().delete(get(surveyId));

	}

}
