package com.rocketseat.certification_nlw.modules.questions.dto;

import java.util.UUID;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlternativesResultDTO {
  private UUID id;
  private String description;
}
