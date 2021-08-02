package io.jay.springbooth2demo;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String phone;
    private boolean activated;
}
