package com.example.demosecurity.controller;

import com.example.demosecurity.security.IAuthenticationFacade;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class WebController {
    @Autowired
    private IAuthenticationFacade authenticationFacade;

    @GetMapping("info-5")
    public ResponseEntity<?> getInfo5() {
        return ResponseEntity.ok(authenticationFacade.getAuthentication());
    }

    @GetMapping("/")
    public String getHome() {
        return "Home Page";
    }

    @GetMapping("/user")
    public String getUser() {
        return "User Page";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Admin Page";
    }

    @GetMapping("info-1")
    public ResponseEntity<?> getInfo1() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return ResponseEntity.ok(authentication);
    }

    @GetMapping("info-2")
    public ResponseEntity<?> getInfo2(Principal principal) {
        return ResponseEntity.ok(principal);
    }

    @GetMapping("info-3")
    public ResponseEntity<?> getInfo3(Authentication authentication) {
        return ResponseEntity.ok(authentication);
    }

    @GetMapping("info-4")
    public ResponseEntity<?> getInfo4(HttpServletRequest request) {
        return ResponseEntity.ok(request.getUserPrincipal());
    }
    @GetMapping("/dashboard")
    public String viewDashboard() {
        return "Viewing Dashboard";
    }

    @GetMapping("/users")
    public String listUsers() {
        return "Listing Users";
    }

    @PostMapping("/users")
    public String createUser() {
        return "Creating User";
    }

    @PutMapping("/users")
    public String updateUser() {
        return "Updating User";
    }

    @GetMapping("/categories")
    public String listCategories() {
        return "Listing Categories";
    }

    @PostMapping("/categories")
    public String createCategory() {
        return "Creating Category";
    }

    @PutMapping("/categories")
    public String updateCategory() {
        return "Updating Category";
    }

    @GetMapping("/products")
    public String listProducts() {
        return "Listing Products";
    }

    @PostMapping("/products")
    public String createProduct() {
        return "Creating Product";
    }

    @PutMapping("/products")
    public String updateProduct() {
        return "Updating Product";
    }

    @GetMapping("/brands")
    public String listBrands() {
        return "Listing Brands";
    }

    @PostMapping("/brands")
    public String createBrand() {
        return "Creating Brand";
    }

    @PutMapping("/brands")
    public String updateBrand() {
        return "Updating Brand";
    }

    @GetMapping("/orders")
    public String listOrders() {
        return "Listing Orders";
    }

    @PostMapping("/orders")
    public String createOrder() {
        return "Creating Order";
    }

    @PutMapping("/orders")
    public String updateOrder() {
        return "Updating Order";
    }

    @GetMapping("/posts")
    public String listPosts() {
        return "Listing Posts";
    }

    @PostMapping("/posts")
    public String createPost() {
        return "Creating Post";
    }

    @PutMapping("/posts")
    public String updatePost() {
        return "Updating Post";
    }

    @GetMapping("/profile")
    public String viewProfile() {
        return "Viewing Profile";
    }

    @PutMapping("/profile")
    public String updateProfile() {
        return "Updating Profile";
    }
}
