package dev.rslab.SimpleDiary.domain.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Getter
@Setter
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="color_id")
    private Integer colorId;

    @Column
    private String name;

    @Column
    private String hexCode;
}
