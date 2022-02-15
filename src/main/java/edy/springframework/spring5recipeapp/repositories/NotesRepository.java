package edy.springframework.spring5recipeapp.repositories;

import edy.springframework.spring5recipeapp.domain.Notes;
import org.springframework.data.repository.CrudRepository;

public interface NotesRepository extends CrudRepository<Notes,Long> {
}
