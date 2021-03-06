package example.codeclan.com.liskov;

import example.codeclan.com.liskov.Interfaces.Drawable;

import static android.R.attr.shape;

/**
 * Created by user on 27/06/2017.
 */

class Artist {
  /*
    A liskov violation takes place when a function takes in an superclass as a parameter - it should be able to take in any of the superclass' subclasses without breaking.
    In this example, we can create a subclass of shape - say, triangle - that when passed to drawShape, returns null rather than "I'm drawing a triangle!".
    Change the code so that it will work regardless of the type of shape that is passed in.
    Hint - you can get the name of an object's class by doing something like:
    this.getClass().getSimpleName();
  */

    public String drawShape(Drawable item) {
        return item.draw();
    }
}
