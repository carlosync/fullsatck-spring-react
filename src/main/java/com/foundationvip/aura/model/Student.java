package com.foundationvip.aura.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long id;
    private String name;
    private String enrollment;
    private String email;
    private Gender gender;

}
