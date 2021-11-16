package com.example.activemq.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "upr_uzenet")
public class UprUzenet extends BaseEntity<Long>  {

  private String dmsId;

}
