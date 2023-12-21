package net.javaguides.springboot.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Reply;
import net.javaguides.springboot.service.ReplyService;

@RestController
@RequestMapping("/api/replies")
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    @GetMapping("/get-replies/{questionId}")
    public ResponseEntity<List<Reply>> getReplies(@PathVariable Long questionId) {
        List<Reply> replies = replyService.getRepliesByQuestionId(questionId);
        return ResponseEntity.ok(replies);
    }

    @PostMapping("/post-reply")
    public ResponseEntity<Reply> postReply(@RequestBody Reply reply) {
        Reply savedReply = replyService.saveReply(reply);
        return ResponseEntity.ok(savedReply);
    }
}

