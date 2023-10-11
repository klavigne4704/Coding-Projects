#include <string>
#include <iostream>
#include "Book.h"

namespace BookDatabase
{
	Book::Book() : author(""), title(""), date("")
	{
	}

	Book::Book(string new_author, string new_title, string new_date) :
		author(new_author), title(new_title), date(new_date)
	{
	}

	void Book::setData(string new_author, string new_title, string new_date)
	{
		author = new_author;
		date = new_date;
		title = new_title;
	}
	
	string Book::getAuthor() const
	{
		return author;
	}

	string Book::getTitle() const
	{
		return title;
	}

	string Book::getDate() const
	{
		return date;
	}

	bool operator<(const Book& book1, const Book& book2)
	{
		return (book1.author < book2.author);
	}

	ostream& operator <<(ostream& outs, const Book& book) 
	{
		outs << book.author << " " << book.title << " " << book.date << endl;
		return outs;
	}

	bool operator ==(const Book& book1, const Book& book2) 
	{
		return(book1.author == book2.author &&
			book1.title == book2.title &&
			book1.date == book2.date);
	}
}