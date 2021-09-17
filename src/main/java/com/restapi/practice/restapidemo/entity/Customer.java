package com.restapi.practice.restapidemo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Setter
@Getter
@Builder // we can use .build() method and directly assign the value in each property with the help of this annotation
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "CUSTOMERINFO")
public class Customer {
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String address;
    private long phone;

}
