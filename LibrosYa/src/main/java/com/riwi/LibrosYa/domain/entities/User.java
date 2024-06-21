package com.riwi.LibrosYa.domain.entities;

import java.util.List;

import com.riwi.LibrosYa.utils.enums.UserRole;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "user")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;
    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 100, nullable = false)
    private String full_name;
    @Column(nullable = false)
    private UserRole role;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "userId",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Loan> loans;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "userId",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Reservation> reservations;
    
}
