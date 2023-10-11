#include <cstdlib>
#include <iostream>
#include "KyleLavigneSetClass.h"
using namespace std;

namespace klsetclass {
    template<class T>
    // default constructor
    Set<T>::Set() : items(NULL), size(0) {
    }

    template <class T>
    // copy constructor
    Set<T>::Set(const Set<T>& other) {
        size = other.size;
        items = other.new_copy();
    }

    template <class T>
    // destructor
    Set<T>::~Set() {
        delete[] items;
    }

    template <class T>
    // adds an item to the set if it doesn't already exist
    void Set<T>::add(T item) {
        if (!contains(item)) {
            T* new_items = new T[size + 1];
            for (int i = 0; i < size; i++) {
                new_items[i] = items[i];
            }
            new_items[size++] = item;
            delete[] items;
            items = new_items;
        }
    }

    template <class T>
    // removes an item from the set if it exists
    void Set<T>::remove(T item) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (items[i] == item) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                items[i] = items[i + 1];
            }
            size--;
        }
    }

    template <class T>
    // returns the size of the set
    int Set<T>::getSize() const {
        return size;
    }

    template <class T>
    // checks if an item exists in the set
    bool Set<T>::contains(T item) const {
        for (int i = 0; i < size; i++) {
            if (items[i] == item) {
                return true;
            }
        }
        return false;
    }

    template <class T>
    // creates a new copy of the set
    T* Set<T>::newCopy() const {
        T* array = new T[size];
        for (int i = 0; i < size; i++) {
            array[i] = items[i];
        }
        return array;
    }

    template <class T>
    // returns a pointer to the items in the set
    T* Set<T>::getItems() const {
        return items;
    }

    template <class T>
    // prints the items in the set in the format of {a, b, ...}
    void printSet(const Set<T>& set) {
        cout << "{";
        for (int i = 0; i < set.getSize(); i++) {
            cout << set.getItems()[i];
            if (i < set.getSize() - 1) {
                cout << ", ";
            }
        }
        cout << "}" << endl;
    }
}
