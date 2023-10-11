#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include "Book.h"
using namespace std;
using namespace BookDatabase;

//Function prototypes
void AddNewBook(vector<Book> &bookdata);
void PrintBooks(vector<Book> &bookdata);
void SortBooks(vector<Book> &bookdata);
void RemoveBook(vector<Book> &bookdata);
void PrintMenu();

int main()
{
    vector<Book> bookdata;
    int choice;

    do
    {
        PrintMenu();
        cin >> choice;
        cin.ignore();
        switch (choice)
        {
        case 1: AddNewBook(bookdata);
            break;
        case 2: PrintBooks(bookdata);
            break;
        case 3: RemoveBook(bookdata);
        }
        
    } while (choice != 4);

    return 0;
}

void AddNewBook(vector<Book>& bookdata)
{
    string newAuthor, newTitle, newDate;

    cout << "Enter author name:" << endl;
    getline(cin, newAuthor);
    cout << "Enter book title:" << endl;
    getline(cin, newTitle);
    cout << "Enter book date:" << endl;
    getline(cin, newDate);

    Book b(newAuthor, newTitle, newDate);
    bookdata.push_back(b);
}

void PrintBooks(vector<Book>& bookdata)
{
    SortBooks(bookdata);
    cout << "The books entered so far, sorted by author:" << endl;
    for (int i = 0; i < bookdata.size(); i++)
    {
        cout << " " << bookdata[i].getAuthor() << ", " << bookdata[i].getTitle() << ", " << bookdata[i].getDate() << endl;
    }

}

void SortBooks(vector<Book>& bookdata)
{
    sort(bookdata.begin(), bookdata.end());
}

void RemoveBook(vector<Book>& bookdata)
{
    if (bookdata.empty()) {
        cout << "There are no books listed." << endl;
    }
    else {
        string author, title, date;

        cout << "Enter author name (Last name, First name):" << endl;
        cin.ignore();
        getline(cin, author);
        cout << "Enter book title to remove:" << endl;
        getline(cin, title);
        cout << "Enter book date:" << endl;
        getline(cin, date);

        Book targetBook(author, title, date);

        vector<Book>::iterator it;
        it = find(bookdata.begin(), bookdata.end(), targetBook);

        if (it != bookdata.end()) {
            bookdata.erase(it);
            cout << targetBook;
            cout << "was removed from the database." << endl;
        }

        else {
            cout << "That book was not found. Check your input and try again." << endl;
        }
    }
}

void PrintMenu()
{
    cout << endl << "Select from the following choices:" << endl;
    cout << "1. Add new book" << endl;
    cout << "2. Print listing sorted by author" << endl;
    cout << "3. Remove a book" << endl;
    cout << "4. Quit" << endl;
}