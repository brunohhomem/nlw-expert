package com.rocketseat.certification_nlw.modules.students.useCases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketseat.certification_nlw.modules.questions.entities.QuestionEntity;
import com.rocketseat.certification_nlw.modules.questions.repositories.QuestionRepository;
import com.rocketseat.certification_nlw.modules.students.dto.StudentCertificationAnswerDTO;
import com.rocketseat.certification_nlw.modules.students.repositories.StudentRepository;

@Service
public class StudentCertificationAnswersUseCase {

  @Autowired
  private StudentRepository repository;

  @Autowired
  private QuestionRepository questionRepository;

  public StudentCertificationAnswerDTO execute(StudentCertificationAnswerDTO dto) throws Exception {
    // Verificar se o usuário existe
    var student = repository.findByEmail(dto.getEmail());

    if (student.isEmpty()) {
      throw new Exception("e-mail incorreto.");
    }
    // Buscar alternativas das perguntas: Correta/Incorreta
    List<QuestionEntity> questionsEntity = questionRepository.findByTechnology(dto.getTechnology())

    dto.getQuestionsAnswers()
    .stream().forEach(questionAnswer -> {
      
      var question = questionsEntity.stream().filter(q -> q.getId().equals(questionAnswer.getQuestionID()))
      .findFirst().get();

      var findCorrectAlternative = question.getAlternatives().stream()
      .filter(alternative -> alternative.isCorrect()).findFirst.get;

      if (findCorrectAlternative.getId().equals(questionAnswer.getAlternativeID())) {
        questionAnswer.setCorrect(true);
      } else{
        questionAnswer.setCorrect(false);
      }
    });
    return dto;

    // Salvar as informações da certificação
  }

}
