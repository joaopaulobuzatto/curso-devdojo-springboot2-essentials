package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;

@Service
public class AnimeService {

    private List<Anime> animes = Arrays.asList(new Anime(1L, "Anime 1"), new Anime(2L, "Anime 2"), new Anime(3L, "Anime 3"));

    public List<Anime> listAll() {
        return animes;
    }

    public Anime findById(Long id) {
        return animes
                .stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found"));
    }
}
