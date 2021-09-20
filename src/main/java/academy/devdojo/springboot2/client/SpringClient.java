package academy.devdojo.springboot2.client;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SpringClient {

    public static void main(String[] args) {
        ResponseEntity<Anime> entity = new RestTemplate().getForEntity("http://localhost:8080/animes/{id}", Anime.class, 44);
        System.out.println(entity);

        Anime object = new RestTemplate().getForObject("http://localhost:8080/animes/{id}", Anime.class, 44);
        System.out.println(object);

    }
}
