package com.question.repositories;

import com.question.entities.Question;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@RegisterReflectionForBinding
public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findByQuizId(Long quizId);

}
