package com.desenvolvimento.bookstoremanager.entity;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Slf4j
public class Book {
    @ToString.Include
    @EqualsAndHashCode.Include
    @NonNull
    private Long id;
    @ToString.Include
    @NonNull
    private String title;
    private String description;
    private String isbn;
}
