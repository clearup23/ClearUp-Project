package net.javaguides.springboot.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

	@Entity
	public class CommunityChat {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long questionId;

	    @ManyToOne
	    @JoinColumn(name = "userId")
	    private User user;

	    private String questionContent;

	  
	 // Getters and Setters
	    public Long getQuestionId() {
	        return questionId;
	    }

	    public void setQuestionId(Long questionId) {
	        this.questionId = questionId;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

	    public String getQuestionContent() {
	        return questionContent;
	    }

	    public void setQuestionContent(String questionContent) {
	        this.questionContent = questionContent;
	    }
	}


