package com.example.key.repository;


import com.example.key.model.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface DivisionRepository extends JpaRepository<Division,Long> {
}
