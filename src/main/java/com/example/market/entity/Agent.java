package com.example.market.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "email_unique",columnNames = "email"),
        @UniqueConstraint(name = "phone_unique",columnNames = "phone")
})
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long agentId;
    private String firstname;
    private String lastname;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phone;
}
