package com.pankaj.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="survey")
public class Survey {
	
	@Id
	@SequenceGenerator(name="sequence_survey",sequenceName="sequence_survey")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="sequence_survey")
	@Column(name="survey_id")
	private int surveyId;
	
	@Column(name="survey_name")
	private String surveyName;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="status")
	private String status;
	
	@Transient
	private List<String> questions;
	
	@Transient
	private List<String> answers;
	
	
	
	

	public Survey(int surveyId, String surveyName, Date startDate,
			Date endDate, String status) {
		super();
		this.surveyId = surveyId;
		this.surveyName = surveyName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getQuestions() {
		return questions;
	}

	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	

}
