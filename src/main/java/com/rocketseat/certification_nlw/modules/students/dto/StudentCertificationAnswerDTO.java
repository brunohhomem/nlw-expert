package com.rocketseat.certification_nlw.modules.students.dto;

import java.util.List;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentCertificationAnswerDTO {
  private String email;
  private String technology;
  private List<QuestionAnswerDTO> questionsAnswers;
}
