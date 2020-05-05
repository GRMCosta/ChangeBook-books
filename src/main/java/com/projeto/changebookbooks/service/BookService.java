package com.projeto.changebookbooks.service;

import com.projeto.changebookbooks.domain.Book;
import com.projeto.changebookbooks.integration.user.response.UserResponse;
import com.projeto.changebookbooks.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void createBook(UserResponse user, Book book){
        book.setUserId(user);
        bookRepository.save(book);
    }



}
