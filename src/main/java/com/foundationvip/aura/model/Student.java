package com.foundationvip.aura.model;

import lombok.*;

@Getter @Setter @AllArgsConstructor
@NoArgsConstructor @ToString @EqualsAndHashCode
public class Student {

    private Long id;
    private String name;
    private String enrollment;
    private String email;
    private Gender gender;

}
