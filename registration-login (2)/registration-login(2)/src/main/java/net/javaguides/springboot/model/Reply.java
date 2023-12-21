package net.javaguides.springboot.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

	@Entity
	public class Reply {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long replyId;

	    @ManyToOne
	    @JoinColumn(name = "userId")
	    private User user;

	    @ManyToOne
	    @JoinColumn(name = "questionId")
	    private CommunityChat question;

	    private String replyContent;
	    private int upvote;

	    // getters and setters
	    public Long getReplyId() {
	        return replyId;
	    }

	    public void setReplyId(Long replyId) {
	        this.replyId = replyId;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

	    public CommunityChat getQuestion() {
	        return question;
	    }

	    public void setQuestion(CommunityChat question) {
	        this.question = question;
	    }

	    public String getReplyContent() {
	        return replyContent;
	    }

	    public void setReplyContent(String replyContent) {
	        this.replyContent = replyContent;
	    }

	    public int getUpvote() {
	        return upvote;
	    }

	    public void setUpvote(int upvote) {
	        this.upvote = upvote;
	    }
	}


