package com.my_project.demo_store.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, name = "bio")
    private String bio;

    @Column(nullable = false, name = "phone_number")
    private String phoneNumber;

    @Column(nullable = false, name = "date_of_birth")
    private String dateOfBirth;

    @Column(nullable = false, name = "loyalty_points")
    private String loyaltyPoints;

    @OneToOne
    @JoinColumn(name = "id")
    @MapsId
    private User user;
}
