package com.example.oauth2.method.domain;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity {

  @Id
  @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
  @GeneratedValue(generator = "uuid-gen")
  // 'uuid-char' for MySQL
  // Additional settings = #ALTER DATABASE db charset=latin1;
  @Type(type = "pg-uuid")
  @Column(name = "id", updatable = false, nullable = false)
  @Getter
  @Setter
  private UUID id;
}
