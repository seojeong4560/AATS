package com.ssafy.d102.data.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "membership")
@Getter
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "membership_no")
    private long membershipNo;

    @Column(name = "membership_type")
    private int membershipType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    // getters, setters, constructors
}