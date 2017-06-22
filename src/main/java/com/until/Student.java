package com.until;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private String Id;
    private String Name;
    private String Sex;
    private String Birth;
    private String Department;
    private String Address;
    private List<Score> Score;

}
