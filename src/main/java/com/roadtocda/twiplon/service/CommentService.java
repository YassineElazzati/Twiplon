package com.roadtocda.twiplon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadtocda.twiplon.model.Comment;
import com.roadtocda.twiplon.repository.CommentRepository;
import com.roadtocda.twiplon.repository.PostRepository;
import com.roadtocda.twiplon.repository.UsersRepository;

@Service
public  class CommentService {
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private UsersRepository userRepository;
	
	@Autowired
	private PostRepository postrepRepository;
	
	
	public Optional<Comment>getComment(final long id ){
		return commentRepository.findById(id);
	}
	public Iterable<Comment> getComments(){
		return commentRepository.findAll();
	}

	public void deleteComment(final Long id) {
		commentRepository.deleteById(id);
	}
	public Comment saveComment(Comment Comment) {
		Comment savedComment = commentRepository.save(Comment);
		return savedComment;
	}
	
}
