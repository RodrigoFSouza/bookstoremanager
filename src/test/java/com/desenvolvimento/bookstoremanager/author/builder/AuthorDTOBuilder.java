package com.desenvolvimento.bookstoremanager.author.builder;

import com.desenvolvimento.bookstoremanager.author.dto.AuthorDTO;
import lombok.Builder;

@Builder
public class AuthorDTOBuilder {
    @Builder.Default
    private final Long id = 1L;
    @Builder.Default
    private final String name = "Rodrigo Ferreira";
    @Builder.Default
    private final Integer age = 35;

    public AuthorDTO buildAuthorDTO() {
        return new AuthorDTO(id, name, age);
    }
}
