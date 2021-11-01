# Task № 1
## Calculator
Implement calculator program. Calculator must perform operations:
- addition, subtraction, multiplication, division, exponentiation.
<div>When performing division, enter a check for 0.</div>
<div>If the second argument is 0, it is necessary to throw java.lang.IllegalStateException.</div>

---
# Task № 2
## Point
<div>Implement a Point class that describes a point in the x, y coordinate system - Point (x, y).</div>
<div>The point object must have methods double Point#distanceTo(Point point) - the method must calculate the distance between two points.</div>

---
# Task № 3
## Triangle
<div>Implement a Triangle class. The triangle must be described through points in the coordinate system.</div>
<div>The triangle object must have methods:</div>

- boolean exists() - checks if the triangle exists or not;
- double area() - calculates the area of the triangle.
<div>If triangle doesn't exist, it is necessary to throw java.lang.IllegalStateException.</div>

---
# Task № 4
## Isosceles Triangle
<div>Implement an Isosceles Triangle class by inheriting the Triangle class from task № 3.</div>
<div>Complement the behavior of the method boolean exists() - true if the triangle is isosceles.</div>
<div>Leave the rest of the behavior the same.</div>

---
# Task № 5
## Right Triangle
<div>Implement a Right Triangle class by inheriting the Triangle class from task № 3.</div>
<div>Complement the behavior of the method boolean exists() - true if the triangle is rectangular.</div>
<div>Leave the rest of the behavior the same.</div>

---
# Task № 6
## Square
<div>Implement a Square class based on the four points Point (x, y).</div>

- boolean exists() - checks if the square exists or not.

---
# Task № 7
## Expression
<div>Implement an Expression class. The class must receive a string from a simple mathematical expression and implement methods:</div>

- double calc().
- must support operations: +. -. /. *. exp.
<div>For example, "2+2" - 4, "2-2" – 0.</div>
If the expression is not correct, it is necessary to throw java.lang.IllegalStateException.

---
# Task № 8
## Primes
Implement a class that computes prime numbers up to N.

---
# Task № 9
## Unique Chars
Implement a method for counting unique characters in a string.

---
# Task № 10
## Brackets
<div>Implement methods for checking the correctness of open and closed parentheses.</div>
For example, ()(()((()))) - true, ()) – false.

---
# Task № 11
## Array Contains One
<div>An array of numbers with values 0 and 1 is given. It is necessary to check that all values in the array are equal to 1.</div>
<div>For example, [0, 1] - false, [1, 1] - true.</div>

---
# Task № 12
## Sequence Array
<div>An array of numbers with values 0 and 1 is given. It is necessary to check that the array contains sequences of three or more ones.</div>
For example, [0, 1, 1] - false, [1, 1, 1] - true.

---
# Task № 13
## Mono Array
<div>Numeric array is given. It is necessary to check that all the values in the array are the same.</div>
For example, [0, 0, 0] - true, [1, 1, 1] - true, [0, 1, 1] - false.

---
# Task № 14
## Reverse Phrase
<div>Sentence is given. It is necessary to rearrange the words in the reverse order.</div>
For example, "program and earn" -> "earn and program".

---
# Task № 15
## Cycle Shift
<div>Numeric array is given. It is necessary to implement the method of ring shift by N: int[] shift().</div>
<div>Don't use an additional array.</div>
For example, [1, 2, 3, 4, 5] -> shift(2) -> [4, 5, 1, 2, 3].

---
# Task № 16
## Tic-Tac-Toe
A square array is given. It is necessary to check that it has winning options for tic-tac-toe.

---
# Task № 17
## Cash Machine
<div>ATM cash machine of money change is implemented. The machine receives a paper bill and exchanges it for coins.</div>
The method should return a list of all possible options for changing the bill.

---
# Task № 18
## Pool
<div>A two-dimensional array filled with zeros and ones is given. It is necessary to define the largest set of ones.</div>
<div>A set is a union of ones that are next to each other.</div>
Ignore diagonal neighborhood.

---
# Task № 19
## Maze
<div>A two-dimensional array of ones and zeros is given. It is necessary to find the minimum path from point A to point B.</div>
You can move only on ones and only vertically or horizontally.

---
# Task № 20
## Combine
A one-dimensional array is given. It is necessary to find all possible variants of permutations of this array.
