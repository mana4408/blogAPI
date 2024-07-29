package me.mana.blogAPI.service;

import lombok.RequiredArgsConstructor;
import me.mana.blogAPI.domain.Article;
import me.mana.blogAPI.dto.AddArticleRequest;
import me.mana.blogAPI.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
