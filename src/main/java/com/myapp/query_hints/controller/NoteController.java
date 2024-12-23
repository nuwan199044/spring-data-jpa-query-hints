package com.myapp.query_hints.controller;

import com.myapp.query_hints.entity.Note;
import com.myapp.query_hints.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoteController {

    private final NoteService noteService;

    @GetMapping("/notes")
    ResponseEntity<List<Note>> findNoteWithDeliveredBottlesGraterThan(@RequestParam int count) {
        return ResponseEntity.ok(noteService.findNoteWithDeliveredBottlesGraterThan(count));
//        return ResponseEntity.ok("ok");
    }

}
