package com.gone993.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*
domain pkg : 도메인을 담을 패키지.
도메인이란 게시글, 댓글, 회원, 정산, 결제 등 소프트웨어에 대한 요구사항 혹은 문제 영역

Posts class : 실제 DB의 테이블과 매칭될 클래스, Entity 클래스 라고도 함
JPA를 사용해 DB데이터에 작업할 경우, 실제 쿼리를 날리기보다는 이 Entity 클래스 수정을 통해 작업한다.
 */

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
