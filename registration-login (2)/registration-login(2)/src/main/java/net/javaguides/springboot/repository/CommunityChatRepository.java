package net.javaguides.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.CommunityChat;

import java.util.List;

	public interface CommunityChatRepository extends JpaRepository <CommunityChat, Long> {
	    List<CommunityChat> findTop10ByOrderByQuestionIdDesc();
	    List<CommunityChat> findByQuestionContentContainingIgnoreCase(String keyword);
	}


