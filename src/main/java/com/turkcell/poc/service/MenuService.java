package com.turkcell.poc.service;

import com.turkcell.poc.entity.Menu;
import com.turkcell.poc.repository.MenuRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


@Service
public class MenuService {
    
    private final MenuRepository menuRepository;
    
    public MenuService(MenuRepository menuRepository){
        this.menuRepository = menuRepository;
    }
    
    public Flux<Menu> getMenuList(){
        return menuRepository.findAll();
    }
    
}
