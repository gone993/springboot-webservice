package com.gone993.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/*
Client가 요청할 양식과 요청을 처리하는 과정에서 기준이 되는 양식, 응답받을 양식을 정의해준 것
 */

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}