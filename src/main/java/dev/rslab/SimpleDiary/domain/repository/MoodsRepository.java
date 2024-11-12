package dev.rslab.SimpleDiary.domain.repository;

import dev.rslab.SimpleDiary.domain.model.Mood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MoodsRepository extends JpaRepository<Mood, Integer> {
    Optional<Mood> findById(Integer id);
}
