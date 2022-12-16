package com.example.UserProduct.service;

import com.example.UserProduct.domain.Product;
import com.example.UserProduct.domain.User;
import com.example.UserProduct.exception.ProductNotFoundException;
import com.example.UserProduct.exception.UserAlreadyFoundException;
import com.example.UserProduct.exception.UserNotFoundException;
import com.example.UserProduct.rabbitMq.CommonUser;

import java.util.List;

public interface UserService {
    public User addUser(User user) throws UserAlreadyFoundException;
    User addUser1(CommonUser commonUser);
    public User addProductForUser(String userId, Product product) throws UserNotFoundException;
    public User deleteProductFromUser(String userId,int productId) throws UserNotFoundException, ProductNotFoundException;
    List<Product> getProductForUser(String userId) throws UserNotFoundException;
}
