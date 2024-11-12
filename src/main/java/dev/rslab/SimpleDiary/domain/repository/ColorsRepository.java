package dev.rslab.SimpleDiary.domain.repository;

import dev.rslab.SimpleDiary.domain.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ColorsRepository extends JpaRepository<Color, Integer> {
    Optional<Color> findById(Integer id);
    Optional<Color> findByName(String name);
}
