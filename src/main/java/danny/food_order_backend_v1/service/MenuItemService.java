package danny.food_order_backend_v1.service;

import danny.food_order_backend_v1.entity.MenuItem;
import danny.food_order_backend_v1.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    public Optional<MenuItem> getMenuItemById(Long id) {
        return menuItemRepository.findById(id);
    }

    public MenuItem createMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public MenuItem updateMenuItem(Long id, MenuItem updatedMenuItem) {
        return menuItemRepository.findById(id).map(menuItem -> {
            menuItem.setName(updatedMenuItem.getName());
            menuItem.setDescription(updatedMenuItem.getDescription());
            menuItem.setPrice(updatedMenuItem.getPrice());
            menuItem.setCategory(updatedMenuItem.getCategory());
            menuItem.setImageUrl(updatedMenuItem.getImageUrl());
            menuItem.setAvailable(updatedMenuItem.getAvailable());
            return menuItemRepository.save(menuItem);
        }).orElseThrow(() -> new RuntimeException("MenuItem not found"));
    }

    public void deleteMenuItem(Long id) {
        menuItemRepository.deleteById(id);
    }
}
