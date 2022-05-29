package com.example.springwithflyway;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @Column(
        name = "id",
        nullable = false
    )
    private UUID id;

    @Column(
        name = "username",
        nullable = false,
        length = 50
    )
    private String username;

    @Column(
        name = "email",
        nullable = false,
        length = 150
    )
    private String email;

    @Column(
        name = "phone",
        length = 20
    )
    private String phone;

    @Column(
        name = "name",
        nullable = false,
        length = 150
    )
    private String name;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    @Column(name = "updated_at")
    private OffsetDateTime updatedAt;

    @Column(name = "deleted_at")
    private OffsetDateTime deletedAt;


    @Column(name = "verified_at")
    private OffsetDateTime verifiedAt;

}