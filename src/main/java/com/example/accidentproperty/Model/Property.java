package com.example.accidentproperty.Model;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Property {
    private int propertyId;
    private String title;
    private int rent;
    private String contents;
    private String imageUrl;
    private String addUser;
    private LocalDateTime addDate;
    private String updateUser;
    private LocalDateTime updateDate;
    private Boolean deleteFlag;
}