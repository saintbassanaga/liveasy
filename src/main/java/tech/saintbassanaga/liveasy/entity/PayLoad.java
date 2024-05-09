package tech.saintbassanaga.liveasy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.proxy.HibernateProxy;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "payload")
public class PayLoad {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private String noOfTrucks;
    private Long weight;
    private String comment;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "shipper_id", nullable = false, unique = true)
    private Shipper shipper;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date date;

}