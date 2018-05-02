package com.example.helloservice;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pivot {
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String name;
}
