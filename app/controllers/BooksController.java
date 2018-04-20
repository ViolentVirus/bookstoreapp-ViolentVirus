package controllers;
import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.books.*;

import javax.inject.Inject;
import java.util.Set;

public class BooksController  extends Controller{

    @Inject
    FormFactory formFactory;

    // For all books
    public Result index(){
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    //to create book
    public Result create(){
        Form<Book> bookForm = formFactory.form(Book.class);
        return ok(create.render(bookForm));
    }

    // for saving book
    public Result save(){
        return TODO;
    }

    //edit single book
    public Result edit (Integer id){
        return TODO;
    }

    public Result update(){
        return TODO;
    }

    public Result destroy(Integer id){
        return TODO;
    }

    public Result show(Integer id){
        return TODO;
    }

}
