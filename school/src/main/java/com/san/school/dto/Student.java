package com.san.school.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer schoolId;

}
