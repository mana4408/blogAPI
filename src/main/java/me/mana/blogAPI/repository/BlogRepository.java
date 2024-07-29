package me.mana.blogAPI.repository;

import me.mana.blogAPI.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
