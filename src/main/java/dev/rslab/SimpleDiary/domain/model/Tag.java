package dev.rslab.SimpleDiary.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Getter
@Setter
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    private Integer tagId;

    @Column
    private String name;

    @ManyToMany
    private Set<Diary>diaries;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;
}
