package com.gone993.book.springboot.web;

import com.gone993.book.springboot.service.menus.MenusService;
import com.gone993.book.springboot.web.dto.MenusListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController

public class MenusApiController {

    private final MenusService menusService;

    @PostMapping("/api/v1/menus")
    public List<MenusListResponseDto> load() {
        return menusService.load();
    }
}
