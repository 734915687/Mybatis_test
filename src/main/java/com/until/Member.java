package com.until;

import lombok.Data;
@Data
public class Member {
    private int id;
    private String account;
    private String pass;
    private String name;
    private Address address;
}
