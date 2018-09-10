package com.pankaj.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="question")
public class Question {

	@Id
	@SequenceGenerator(name="sequence_question",sequenceName="sequence_question")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="sequence_question")
	@Column(name="question_id")
	private int questionId;
	
	@Column(name="question")
	private String question;
	
	@Transient
	private List<String> answers;
	
	@ManyToOne
	@JoinColumn(name="survey_id")
	private Survey survey;

	public Question(int questionId, String question, Survey survey) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.survey = survey;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
	
	
	
}
