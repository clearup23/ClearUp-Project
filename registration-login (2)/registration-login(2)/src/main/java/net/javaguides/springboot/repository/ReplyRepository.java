package net.javaguides.springboot.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Reply;

	public interface ReplyRepository extends JpaRepository<Reply, Long> {
	    List<Reply> findByQuestion_QuestionIdOrderByReplyIdDesc(Long questionId);
	}


