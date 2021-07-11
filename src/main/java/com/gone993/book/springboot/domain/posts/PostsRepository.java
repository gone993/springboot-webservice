package com.gone993.book.springboot.domain.posts;

/*
Posts 클래스로 데이터베이스를 접근하게 해줌
인터페이스 생성 후, JpaRepository<Entity Class, PK type>을 상속하면 기본적 CRUD 메소드가 생성됨
 */

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
