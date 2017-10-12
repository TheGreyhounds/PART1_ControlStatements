# Control Statements
Our programs can take on much than the simple literary structures we've been using.

The term "control statement" refers to two things, selection statements and loops. An example of a
selection statement is the try-catch block, which will execute the catch block only if the try block
"throws" an exception. An example of a loop is the do-while loop, which executes its code block, and if its
boolean expression executes as true, executes the code block again.

Control statements are useful because they increase the readability of code and reduce redundincity;
they make code *clean*.

An almost exhausted list of control statements include:
- *If*, *else if*, *else* statements, formatted:
```
if (boolean_expression1) {
        ...
} else if (boolean_expression2) {
        ...
        // ... as many else if statements as you'd like
} else {
        ...
}
```
The code in the *if* statement only executes if its boolean expression evaluates to true. If it doesn't, the 
boolean expression of the next *else if* is evaluated, which if that doesn't evaluate to true, then the next
*else if* boolean expression is evaluated, and so on, until if all the boolean expressions in the chain have
evaluated to false, then the code in the *else* statement executes.

- *For* loop, formatted:
```
for (counter variable initialization; boolean expression; change in counter) {
        ...
        // code block to execute each iteration
        ...
}
```
The *for* loop is very flexible, and has three parts: a counter variable is initialized to some starting value,
a boolean expression that is checked at the beginning of each iteration before continuing, and a statement that
changes the counter variable in some way. At its most basic however, only the boolean expression must be defined
in a *for*-loop
```
for ( ; true ; ) {
        ...
}
```
making it a glorified *while*-loop. More commonly, multiple variables might be initialized in a *for*-loop, or a 
decrement operator may be used.
```
for (int a = 4, b = 10; a < b; a++, b--) {
        ...
}
```

- *For-each* loop, formatted:
```
for (Object object : arrayOfTypeObject) {
        ...
}
```
The *for-each* loop short-hand is equivalent to the *for*-loop expression
```
for (int i = 0; i < arrayOfTypeObject.length; i++) {
        Object object = arrayOfTypeObject[i];
        ...
}
```
and is incredibely useful for making the incredibely common task of iterating through an array more readable.

- *Try-catch-finally* block, formated:
```
try {
        // Code that may throw an exception
} catch (ExceptionType ex) {
        // Code that runs if that exception is thrown
} finally {
        // Code that always runs at the end, no matter if
        // an exception was thrown or not.
}
```
The *try-catch-finally* block is used solely to handle exceptions in programs, which arise from things the
programmer can't account for, like Input/Ouptut exceptions or FileNotFound exceptions for instance. This code block
branches the program, executing the *try* and *finally* blocks if no exception is thrown, and all three of the blocks
if the exception is.

- *While* loop, formatted:
```
while (boolean_expression) {
        ...
}
```
Everytime before the *while* loop excutes the code in its block, it checks the boolean expression to see if its true.
The *while* loop will continue executing the code block until the boolean expression evaluates as false, in which case
the program moves on. If the boolean expression does not ever evaluate as false, then the *while* loop runs forever -
or at least until the program Control-C's the program.

- *Do-while* loop, formatted:
```
do {
        ...
} while (boolean_expression)
```
The *do-while* loop is identical to the *while* loop, except that it executes the code in its block one time before checking
its boolean expression. From there, it continues like a normal *while* loop.

- *Switch* statement, formatted:
```
switch (variable) {
        case value1:
                ...
                break;
        case value2:
                ...
                break;
        case value3:
                ...
                break;
        ...
        default:
                ...
}
```
This is equivalent to the *if*, *else if*, *else* expression:
```
if (variable == value1) {
        ...
} else if (variable == value2) {
        ...
} else if (variable == value3) {
        ...
}
...
else {
        ...
}
```
The shorthand of the *switch* statement however makes it preferable in some cases to an *if-else if-else* ladder.


The key takeaway from this repository is that there are a number of ways to structure your program, and sometimes
one way isn't better than another. Certain control statements are always going to be right for the job however, and
it's your job as a programmer to understand these, because they are the most common structures used by professionals
in all fields and lines of work. Study, use, and practice with selection statements and loops. You're going to need
to be quite good with them if you want to write worth while programs.



