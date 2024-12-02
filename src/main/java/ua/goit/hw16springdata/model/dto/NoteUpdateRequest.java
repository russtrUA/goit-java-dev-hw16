package ua.goit.hw16springdata.model.dto;


public record NoteUpdateRequest(Long id, String title, String content) {
}

