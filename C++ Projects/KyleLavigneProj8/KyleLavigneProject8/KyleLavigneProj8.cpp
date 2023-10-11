#include <iostream>
#include "KyleLavigneSetClass.cpp"
#include "KyleLavigneSetClass.h"

using namespace std;
using namespace klsetclass;

int main() {
    // Test Set of integers
    Set<int> int_set;
    int_set.add(3);
    int_set.add(1);
    int_set.add(4);
    int_set.add(1); // should not be added again
    printSet(int_set); // should print "{3, 1, 4}"
    int_set.remove(1);
    printSet(int_set); // should print "{3, 4}"

    // Test Set of floats
    Set<float> float_set;
    float_set.add(3.14f);
    float_set.add(2.718f);
    float_set.add(3.14f); // should not be added again
    printSet(float_set); // should print "{3.14, 2.718}"
    float_set.remove(2.718f);
    printSet(float_set); // should print "{3.14}"

    // Test Set of characters
    Set<char> char_set;
    char_set.add('a');
    char_set.add('b');
    char_set.add('c');
    char_set.add('c'); // should not be added again
    printSet(char_set); // should print "{a, b, c}"
    char_set.remove('b');
    printSet(char_set); // should print "{a, c}"

    // Test Set of strings
    Set<string> string_set;
    string_set.add("hello");
    string_set.add("world");
    string_set.add("hello"); // should not be added again
    printSet(string_set); // should print "{hello, world}"
    string_set.remove("world");
    printSet(string_set); // should print "{hello}"

    return 0;
}
