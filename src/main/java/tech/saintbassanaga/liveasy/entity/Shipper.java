package tech.saintbassanaga.liveasy.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@Entity
@Table(name = "shipper")
public class Shipper {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;
    private String name;
    private String email;


    @OneToMany(mappedBy = "shipper", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PayLoad> payLoads = new LinkedHashSet<>();

}