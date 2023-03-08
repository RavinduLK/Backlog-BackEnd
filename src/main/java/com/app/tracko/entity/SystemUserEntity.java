package com.app.tracko.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="SystemUser")
public class SystemUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long SystemUserId;
    private String firstName;
    private String lastName;
    private String password;
    private String emailId;

//  @Column(name = "verification_token")
//  private String verificationToken;



}
