package com.pankaj.dao;

import java.util.List;

import com.pankaj.model.Survey;

public interface SurveyDAO {
	
	public Survey get(int surveyId);
	public List<Survey> listAllSurvey();
	public int save(Survey survey);
	public void update(Survey survey);
	public void view(Survey survey);
	public void delete(int surveyId);
	

}
