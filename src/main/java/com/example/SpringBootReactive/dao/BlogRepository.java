package com.example.SpringBootReactive.dao;

import com.example.SpringBootReactive.dao.entity.Blog;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BlogRepository extends ReactiveMongoRepository<Blog, String> {

    Flux<Blog> findByAuthor(String author);

    Flux<Blog> findByAuthorAndDeleteIsFalse(String titleKeyword);

    Mono<Blog> findByTitle(String title);

    Mono<Blog> findByIdAndDeleteIsFalse(String id);
}
