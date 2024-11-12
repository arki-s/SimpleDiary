package dev.rslab.SimpleDiary.domain.repository;

import dev.rslab.SimpleDiary.domain.model.Diary;
import dev.rslab.SimpleDiary.domain.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DiariesRepository extends JpaRepository<Diary, Integer> {
    Optional<Diary> findById(Integer id);

    Optional<Diary> findByTag(Tag tag);
}
