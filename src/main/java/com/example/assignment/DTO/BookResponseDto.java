package com.example.assignment.DTO;

import com.example.assignment.Domain.Book;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class BookResponseDto {
    private Long bookId;
    private String bookname;
    private Boolean extinction;
    private int isbn;
    private int bookpage;
    private int age;
    private double price;
    private int currency;
    private String author;

    public BookResponseDto(Book book){
        this.bookId = book.getId();
        this.bookname = book.getBookName();
        this.extinction = book.getExtinction();
        this.isbn = book.getIsbn();
        this.bookpage = book.getBookpage();
        this.age = book.getAge();
        this.price = book.getPrice();
        this.currency = book.getCurrency();
        this.author = book.getAuthor();
    }
}
