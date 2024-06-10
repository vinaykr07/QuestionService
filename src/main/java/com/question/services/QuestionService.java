package com.question.services;


import com.question.entities.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {
    Question create(Question question);

    List<Question> getAll();

    Question get(Long id);

    List<Question> QuestionByQuizId(Long quizId);

}
