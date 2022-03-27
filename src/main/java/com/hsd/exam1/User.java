package com.hsd.exam1;


import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class User {
    public long id;
    public LocalDateTime regdate;
    public LocalDateTime updatedate;
    public String email;
    public String password;
    public String name;
}
