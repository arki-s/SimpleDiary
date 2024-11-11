package dev.rslab.SimpleDiary.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Getter
@Setter
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="diary_id")
    private Integer diaryId;

    @Column
    private LocalDate date;

    @Column(length = 400)
    private String comment;

    @ManyToMany
    @JoinTable(
            name = "diary_tag",
            joinColumns = @JoinColumn(name = "diary_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags;

    @ManyToOne
    @JoinColumn(name = "mood_id")
    private Mood mood;
}
