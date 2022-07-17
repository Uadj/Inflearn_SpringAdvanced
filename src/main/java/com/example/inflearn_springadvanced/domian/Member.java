package com.example.inflearn_springadvanced.domian;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Member {
    private Long id;
    private String username;
    private int age;

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
