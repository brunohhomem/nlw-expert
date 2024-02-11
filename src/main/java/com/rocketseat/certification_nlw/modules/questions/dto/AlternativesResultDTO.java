package com.rocketseat.certification_nlw.modules.questions.dto;

import java.util.UUID;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AlternativesResultDTO {
  private UUID id;
  private String description;
}
