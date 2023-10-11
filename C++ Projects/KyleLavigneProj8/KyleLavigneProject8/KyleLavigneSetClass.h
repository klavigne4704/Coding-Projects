#ifndef SET_H
#define SET_H

#include <cstdlib>

namespace klsetclass {

    template <class T>
    class Set {
    public:
        // Default constructor.
        Set();

        // Copy constructor.
        // Parameters: const Set<T>& other - the set to copy.
        Set(const Set<T>& other);

        // Destructor.
        ~Set();

        // Adds an item to the set.
        // Parameters: T item - the item to add.
        void add(T item);

        // Removes an item from the set.
        // Parameters: T item - the item to remove.
        void remove(T item);

        // Gets the size of the set.
        // Returns: int - the size of the set.
        int getSize() const;

        // Checks if an item is contained in the set.
        // Parameters: T item - the item to check.
        // Returns: bool - true if the item is in the set, false otherwise.
        bool contains(T item) const;

        // Creates a new copy of the set.
        // Returns: T* - a pointer to the array of items in the new copy.
        T* newCopy() const;

        // Gets a pointer to the array of items in the set.
        // Returns: T* - a pointer to the array of items.
        T* getItems() const;

    private:
        // The array of items in the set.
        T* items;

        // The number of items in the set.
        int size;
    };
}

#endif
