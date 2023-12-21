package net.javaguides.springboot.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.CommunityChat;
import net.javaguides.springboot.service.CommunityChatService;

	@RestController
	@RequestMapping("/api/community")
	public class CommunityChatController {
	    @Autowired
	    private CommunityChatService communityChatService;

	    @GetMapping("/recent-questions")
	    public ResponseEntity<List<CommunityChat>> getRecentQuestions() {
	        List<CommunityChat> recentQuestions = communityChatService.getRecentQuestions();
	        return ResponseEntity.ok(recentQuestions);
	    }

	    @GetMapping("/search")
	    public ResponseEntity<List<CommunityChat>> searchQuestions(@RequestParam String keyword) {
	        List<CommunityChat> searchResults = communityChatService.searchQuestions(keyword);
	        return ResponseEntity.ok(searchResults);
	    }

	    @PostMapping("/post-question")
	    public ResponseEntity<CommunityChat> postQuestion(@RequestBody CommunityChat question) {
	        CommunityChat savedQuestion = communityChatService.saveQuestion(question);
	        return ResponseEntity.ok(savedQuestion);
	    }
	}

	
