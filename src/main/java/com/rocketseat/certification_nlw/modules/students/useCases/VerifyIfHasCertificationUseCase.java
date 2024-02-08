package com.rocketseat.certification_nlw.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketseat.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import com.rocketseat.certification_nlw.modules.students.repositories.CertificationStudentRepository;

@Service
public class VerifyIfHasCertificationUseCase {

  @Autowired
  private CertificationStudentRepository repository;

  public boolean execute(VerifyIfHasCertificationDTO dto) {

    var result = repository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());

    if (result != null) {
      return true;
    }
    return false;
  }
}
