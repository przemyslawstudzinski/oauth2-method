package com.example.oauth2.method.dto;

import com.example.oauth2.method.domain.BaseEntity;
import java.time.LocalDate;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

public class EmployeeDto extends BaseEntity {

  @Setter
  @Getter
  @NotNull
  String name;

  @Setter
  @Getter
  @NotNull
  String lastName;

  @Setter
  @Getter
  LocalDate birthDate;

  @Setter
  @Getter
  LocalDate startWork;

  @Setter
  @Getter
  LocalDate endWork;

  @Setter
  @Getter
  double salary;

  @Setter
  @Getter
  String position;
}
