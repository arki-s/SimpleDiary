package dev.rslab.SimpleDiary.domain.repository;

import dev.rslab.SimpleDiary.domain.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TagsRepository extends JpaRepository<Tag, Integer> {
    Optional<Tag> findById(Integer id);
}
