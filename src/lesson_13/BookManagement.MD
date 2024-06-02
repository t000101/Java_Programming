# Book Management

Menu:

```
===== Book Management Program (CRUD) =====
1. New Book
2. Find a book (ISBN)
3. Update a book
4. Delete a book
5. Print the Book list
6. Exit

```

## Options explanations

### 1. New Book
```
Please input ISBN: 
Please input title:
Please input author:
Please input year:
```

### 2. Find a book (ISBN)
```
Please input ISBN: 
```

* If the book found -> print the Book {ISBN, title, author, year}
* If the book is not found -> Book with ISBN <1234> is not found.

### 3. Update a book
```
Please input ISBN: 
  (control if the book is not existing...)
Please input new title:
Please input new author:
Please input new year:

The book is new updated with the new content: Book {ISBN, title, author, year)
```


### 4. Delete a book
```
Please input ISBN: 
  (control if the book is not existing...)
```

## Print book list example
```
Book 01: Cuon theo chieu gio
    ISBN: 1234
    Author: Teo
    Year: 2022
    
Book 02: Tieng chim hot trong bui man gai
    ISBN: 1235
    Author: Ti
    Year: 2021
```

## Hints
* Add new: Get the old book list -> add new -> save again!
* Update: Get the old book list -> find -> update that book object -> save again!
* Delete: Get the old book list -> find -> delte -> save again!