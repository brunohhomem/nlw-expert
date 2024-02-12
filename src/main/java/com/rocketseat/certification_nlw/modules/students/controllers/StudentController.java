package com.rocketseat.certification_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.certification_nlw.modules.students.dto.StudentCertificationAnswerDTO;
import com.rocketseat.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import com.rocketseat.certification_nlw.modules.students.useCases.StudentCertificationAnswersUseCase;
import com.rocketseat.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;

@RestController
@RequestMapping("/students")
public class StudentController {

  @Autowired
  private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

  @Autowired
  private StudentCertificationAnswersUseCase studentCertificationAnswersUseCase;

  @PostMapping("verifyIfHasCertification")
  public String verifyIfHasCertification(@RequestBody VerifyIfHasCertificationDTO dto) {
    var result = this.verifyIfHasCertificationUseCase.execute(dto);
    if (result) {
      return "Usuário já fez a prova.";
    }
    return "Usuário pode fazer a prova.";
  }

  @PostMapping("/certification/answer")
  public StudentCertificationAnswerDTO certificationAnswer(
      @RequestBody StudentCertificationAnswerDTO studentCertificationAnswerDTO) throws Exception {
    return this.studentCertificationAnswersUseCase.execute(studentCertificationAnswerDTO);
  }
}
