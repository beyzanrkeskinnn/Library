package dev.patika.Library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.patika.Library.entities.Author;

import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {
}
