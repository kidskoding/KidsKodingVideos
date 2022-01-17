package KidsKodingVideos;
public abstract class ModifiersDemo {
    protected final String[] rossKids = {"Emma", "Luke", "Ravi", "Zuri"};
    protected abstract void jessie(String[] rossKids); //abstract. protected method
}
/* Modifiers: control the visibillity or behavior of a method class attribute, or constructor. There are two types, Access Modifiers
* that control the access/visibillity and Non-Access Modifiers that control the behavior */

/* Access Modifiers: control the visibillity of a method, class, attribute, or constructor
* public: method, class, attribute, constructor is visible among all packages 
* default: method, class, attribute, constructor is visible in only the package it's declared in
* private: method, attribute, constructor is visible in only the class it's declared in
* protected: method, attribute, constructor is visible in only the package and subclasses it's declared in */

/* Non-Access Modifiers: control the behavior of a method, class, or attribute
* static: method, attribute belongs to class it's declared in rather than an object
* final: methods declared final cannot be overridden, attributes declared final cannot change their value, classes declared final cannot
extend another class
* abstract: classes declared abstract cannot create objects. A method declared abstract must be present within an abstract class.
An abstract method is empty (it has no body). Abstract methods and classes can be used in a respective subclass */

