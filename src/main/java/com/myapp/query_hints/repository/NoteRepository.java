package com.myapp.query_hints.repository;

import com.myapp.query_hints.entity.Note;
import jakarta.persistence.QueryHint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

    @Query("SELECT n FROM Note n WHERE n.deliveredBottles > :count")
    @QueryHints({
            @QueryHint(name = "org.hibernate.readOnly", value = "true"),
            @QueryHint(name = "org.hibernate.fetchSize", value = "50"),
            @QueryHint(name = "org.hibernate.cacheable", value = "true"),
            @QueryHint(name = "javax.persistence.cache.retrieveMode", value = "USE"),
            @QueryHint(name = "javax.persistence.cache.storeMode", value = "USE")
    })
    List<Note> findNoteWithDeliveredBottlesGraterThan(@Param("count") int count);
}
