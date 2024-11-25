package com.leek.demo2_springsec.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Customer {
    private String id;
    private String name;
    private String email;
    private String phone;
}
