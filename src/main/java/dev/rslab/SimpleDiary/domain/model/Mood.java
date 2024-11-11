package dev.rslab.SimpleDiary.domain.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Getter
@Setter
public class Mood {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mood_id")
    private Integer moodId;

    @Column
    private String name;
}
