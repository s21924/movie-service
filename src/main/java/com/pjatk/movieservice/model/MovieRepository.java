package com.pjatk.movieservice.model;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {



}



//    Dodaj interfejs rozszerzający „JpaRepository”​
//
//        Przepisz „MovieService” tak, aby od teraz wykorzystywał dane dostarczane z bazy danych