package com.myapp.query_hints.service;

import com.myapp.query_hints.entity.Note;
import com.myapp.query_hints.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository noteRepository;

    public List<Note> findNoteWithDeliveredBottlesGraterThan(int count) {
        return noteRepository.findNoteWithDeliveredBottlesGraterThan(count);
    }
}
