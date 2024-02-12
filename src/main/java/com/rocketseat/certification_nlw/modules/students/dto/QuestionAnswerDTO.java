package com.rocketseat.certification_nlw.modules.students.dto;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuestionAnswerDTO {

  private String questionID;
  private String alternativeID;
  private boolean isCorrect;
}
