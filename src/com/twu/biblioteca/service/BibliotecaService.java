package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenzhou on 8/1/16.
 */
public class BibliotecaService {
    private List<Book> myAllBooks = new ArrayList<Book>();

    public BibliotecaService() {
        LoadAllBookList();
    }

    public List<Book> getMyAllBooks() {
        return myAllBooks;
    }

    public void LoadAllBookList(){
        myAllBooks.add(new Book("math"));
        myAllBooks.add(new Book("chinese"));
        myAllBooks.add(new Book("english"));
    }

    public void GetWelcomeMessage() {
        System.out.println("Welcome To Biblioteca Library!");
    }

    public void ListBooks() {
        StringBuilder st = new StringBuilder();
        st.append("****          All Book Detials           ****\n")
                .append("*********************************************\n")
                .append("****    Name                             ****\n")
                .append("*********************************************\n");
        for (Book book : getMyAllBooks()) {
            if (!book.isCheckedOut()) {
                st.append("****    "+book.getName() + "\n");
            }
        }
        st.append("*********************************************\n\n\n");
        System.out.println(st.toString());
    }
}
