package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report extends DateTimeAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @OneToOne
    @JoinColumn(
            name = "location_id"
    )
    private Location location;

    private String imagePath;
    private String videoPath;

}
