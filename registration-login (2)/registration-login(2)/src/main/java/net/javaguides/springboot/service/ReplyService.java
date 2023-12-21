package net.javaguides.springboot.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Reply;
import net.javaguides.springboot.repository.ReplyRepository;

	@Service
	public class ReplyService {
	    @Autowired
	    private ReplyRepository replyRepository;

	    public List<Reply> getRepliesByQuestionId(Long questionId) {
	        return replyRepository.findByQuestion_QuestionIdOrderByReplyIdDesc(questionId);
	    }

	    public Reply saveReply(Reply reply) {
	        return replyRepository.save(reply);
	    }
	}


