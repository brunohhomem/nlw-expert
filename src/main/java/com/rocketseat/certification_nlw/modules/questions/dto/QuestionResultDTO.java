package com.rocketseat.certification_nlw.modules.questions.dto;

import java.util.List;
import java.util.UUID;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionResultDTO {
  private UUID id;
  private String technology;
  private String description;

  private List<AlternativesResultDTO> alternatives;
}
