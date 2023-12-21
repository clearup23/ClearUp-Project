package net.javaguides.springboot.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.CommunityChat;
import net.javaguides.springboot.repository.CommunityChatRepository;

	
	@Service
	public class CommunityChatService {
	    @Autowired
	    private CommunityChatRepository communityChatRepository;

	    public List<CommunityChat> getRecentQuestions() {
	        return communityChatRepository.findTop10ByOrderByQuestionIdDesc();
	    }

	    public List<CommunityChat> searchQuestions(String keyword) {
	        return communityChatRepository.findByQuestionContentContainingIgnoreCase(keyword);
	    }

	    public CommunityChat saveQuestion(CommunityChat question) {
	        return communityChatRepository.save(question);
	    }
	}

