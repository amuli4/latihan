# 1. When a class implements to Comparable interface, what method must also be implemented?

**compareTo**

*Explanation*
`When a class implements the Comparable interface, it must also implement the compareTo method1. The compareTo method is used to compare the current object with another object of the same type. It returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object`

# 2. You’re encapsulating the Clothing class’s price field by writing a setPrice method. The price field must always be set above a certain minimum. 
#    How would you implement this method?

[ ]
public void setPrice(double price) {
    if(price < MIN_PRICE){
        this.price = MIN_PRICE;
    }
    this.price = price;
}

[ ]
public void setPrice() {
    if(price < MIN_PRICE){
        price = MIN_PRICE;
    }
    else{
        price = this.price;
    }
}

[x]
public void setPrice(double price) {
    if(price < MIN_PRICE){
        this.price = MIN_PRICE;
    }
    else{
        this.price = price;
    }
}

[ ]
public void setPrice(double price) {
    this.price = price;
}

*Explanation*
`In the above implementation, the setPrice method takes a double parameter price and checks if it is less than the minimum price. If it is, the method sets the price field to the minimum price. Otherwise, it sets the price field to the specified price`

# 3. Given: 
#    Employee[] department = new Employee[10];
#    What exception occurs when you try adding an eleventh employee to the department?

[x] ArrayIndexOutOfBoundsException

[ ] IOException

[ ] ArithmeticException

[ ] NullPointerException

*Explanation*
`The department array is initialized with a length of 10, which means it can hold a maximum of 10 elements. If you try to add an eleventh element to the array, you will get an ArrayIndexOutOfBoundsException because the index is out of bounds`

# 4. Given:
#    Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
#    How would you declare the Clothing constructor?

[ ] public void Clothing(description, size){…}

[ ] public Clothing(String description, String size, double price){…}

[ ] public void Clothing(String description, double price, String size){…}

[x] public Clothing(String description, double price, String size){…}

[ ] public Clothing(String description, double price){…}

*Explanation*
`In the above implementation, the Clothing class has three instance variables: description, price, and size. The constructor takes three parameters: description, price, and size, and initializes the instance variables with the specified values.`

# 5. Which is a valid print statement?

[x] System.out.println("Welcome to Duke's Choice Shop!");

[ ] System.out.println(Welcome to Duke's Choice Shop!)

[ ] System.out.println("Welcome to Duke's Choice Shop!")

[ ] System.out(Welcome to Duke's Choice Shop!).println;

[ ] System.println("Welcome to Duke's Choice Shop! ");

*Explanation*
`The System.out.println() method is used to print text on the console in Java. It accepts a string as a parameter and prints the string followed by a newline character`

# 6. You’ve setup a Clothing class with a has a public double field price. You’ve created two instances in your program’s main method where item1 is a  jacket and item2 is a shirt. You’ve also created a double for a tax rate in the main method. How would you accurately calculate the after-tax total for two shirts and a jacket from the main method?

[ ] double total = (item2*2 + item1*(1+tax);

[ ] int total = (item2.price*2 + item1.price)*(1+tax);

[ ] int total = item2.price+item2.price+item1.price *tax;

[x] double total = (item2.price*2 + item1.price)*(1+tax);

[ ] double total = item2.price+item2.price+item1.price *tax;

*Explanation*
`to calculate accurately we need to keep the fraction by using double variable`

# 7. You have a Customer class with a public String field size. In your program’s main method, you create a Customer instance c1. 
#    How could you consolidate this switch statement, which is used to set sizes based on an int variable measurement? 
#    switch(measurement){
#      case 1:
#        c1.size "S";
#        break;
#      case 2:
#        c1.size = S";
#        break;
#      case 3:
#        c1.size = S";
#        break;
#    }

[ ]
switch(measurement){
    case 1 || 2 || case 3:
        c1.size = "S";
        break;
}

[ ]
switch(measurement){
    case 1, case 2, case 3,
        c1.size = "S";
        break;
}

[X]
switch(measurement){
    case 1: case 2: case 3:
        c1.size = "S";
        break;
}

[ ]
switch(measurement){
    case 1, 2, 3:
        c1.size = "S";
        break;
}

*Explanation*
`In the above implementation, the switch statement checks the value of the measurement variable and sets the size field of the c1 instance to "S" if the value is 1, 2, or 3`

# 8. How would you create a Customer class with a String field name?

[x]
public class Customer{
    String name;
}

[ ]
public class Customer{
    String = name;
}

[ ]
public class Customer{
    String = "name";
}

[ ]
public class Customer{
    name String;
}

*Explanation*
`In the above implementation, the Customer class has one instance variable: name. The correct syntax for variable declaration in java first the data type followed by variable name`

# 9. You have an array of Clothing objects called items. The Clothing class has public fields for size and price. 
#    You create a loop to calculate the total price of items. 
#    How would you add an if statement to ensure an item is only added to the total if it’s the same size as the customer c1? 
#    Assume the Customer class has a public String field size.

[x]
for(Clothing c: items){
    if(c.size.equals(c1)){
        //add to total
    }
}

[ ]
for(Clothing c: items){
    if(items[c].size.equals(c.size)){
        //add to total
    }
}

[ ]
for(Clothing c: items){
    if(c == c1)){
        //add to total
    }
}

[ ]
for(Clothing c: items){
    if(c.size.equals(c1.size)){
        //add to total
    }
}

*Explanation*
`In the above implementation, we first initialize a total variable. We then iterate over each Clothing object in the items array and check if its size is equal to the size of the customer c1. If it is, we add the price of the Clothing object to the total variable. Finally, we return the total variable`

# 10. You’ve overridden the toString method in the Clothing class. From which class does this method originate?

[ ] ShopApp

[x] Object

[ ] Customer

[ ] Comparable

*Explanation*
`The toString method is a pre-existing method found in the Object class. Every class in Java is a child of the Object class either directly or indirectly. And since the Object class contains a toString method, we can call toString on any instance and get its string representation`

# 11. According to this course, what library should you add to your project so that it can be deployed on the Oracle Cloud?

[x] Helidon

[ ] Mastodon

[ ] Mastodon

[ ] Helium

*Explanation*
`Helidon is an open-source Java microservices framework that provides a collection of libraries and tools for building cloud-native applications`

# 12. Given:
#     public Customer(String name, int measurement) {…}
#     How would you instantiate a Customer object using this constructor?

[x] Customer c1 = new Customer("Pinky", 3);

[ ] Customer c1 = new Customer("Pinky", 3, items);

[ ] Customer c1 = new Customer();

[ ] Customer c1 = new Customer("Pinky", "S");

[ ] Customer c1 = new Customer("Pinky", "S", items);

[ ] Customer c1 = new Customer("Pinky");

*Explanation*
`In the above implementation, we create a new instance of the Customer class and pass the String "Pinky" and the int 3 as arguments to the constructor`

# 13. How would you loop through the Clothing array items to calculate the total price of all items after tax? 
#     The Clothing class has a public double field price. Assume the double variables total and tax are already declared.

[ ]
forEach(Clothing c in items){
    total += c.price*(1+tax);
}

[x]
for(Clothing c: items){
    total = total + c.price*(1+tax);
}

[ ]
for(Clothing c: items){
    total = c.price*(1+tax);
}

[ ]
for(Clothing c: items[]){
    total = total + c.price*tax;
}

*Explanation*
`In the above implementation, we first initialize a total variable. We then iterate over each Clothing object in the items array and add the price of the Clothing object multiplied by 1 + tax to the total variable. Finally, we return the total variable.`

# 14. You write a method to calculate the average price of all Clothing items owned by a Customer. This method adds the price of all items, then divides this value by the number of items. If there are no items, your method will attempt to divide by zero. What type of exception must you guard against in this scenario?

[ ] NullPointerException

[ ] IOException

[x] ArithmeticException

[ ] ArrayIndexOutOfBoundsException

*Explanation*
` If there are no items, your method will attempt to divide by zero, which will result in an ArithmeticException`

# 15. You have a Customer class with a public String field size. In you program’s main method, you create a Customer instance c1. 
#     What is printed as a result of running this code from the main method?
#     int measurement = 3;
#     switch(measurement){
#       case 3:
#         c1.size = "S";
#       case 6:
#         c1.size = "M";
#       case 9:
#         c1.size = "L";
#         break;
#       default:
#         c1.size = "X";
#     }
#     System.out.println(c1.size);

[ ] M

[ ] S

[ ] X

[x] L

*Explanation*
`In the given code, we first declare an int variable measurement and initialize it to 3. We then use a switch statement to check the value of measurement. Since measurement is equal to 3, the code block associated with the case 3 label is executed, which sets the size field of the c1 instance to "S". The code blocks associated with the case 6 and case 9 labels are also executed because there are no break statements between them and the previous case. However, since there is a break statement after the case 9 label, the default code block is not executed. Finally, we print the value of the size field of the c1 instance, which is "L" because it was set by the case 9 code block`

# 16. You’ve encapsulated the Customer class’s size field. The related setSize method requires an integer argument.
#     This argument is translated into a String, which is used to set the class’s size String field.
#     You instantiate a Customer c1 in the main method, which is written in another class. 
#     How should you set the size of customer c1 from the main method?

[x] c1.setSize(3);

[ ] c1.size = "S";

[ ] c1.size = 3;

[ ] c1.setSize('S');

*Explanation*
`To set the size of Customer c1 from the main method, you can use the setSize method and pass an int argument that represents the size`

# 17. You’ve created a Clothing class along with two instances item1 and item2. How could you create a Clothing array to store these two items?

[ ] Clothing[] items(item1, item2);

[ ] Clothing items = [item1, item2];

[x] Clothing[] items = {item1, item2};

[ ] Clothing items(item1, item2});

*Explanation*
`To create a Clothing array to store the item1 and item2 instances, add square braces in the object for an array and you can use curly braces for the values`

# 18. How would you declare the MIN_PRICE field of the Clothing class? 
#     The value of this field should never change. Accessing this field should not require you to create a Clothing instance.

[ ] public double static final MIN_PRICE = 10.0;

[ ] public static double MIN_PRICE = 10.0;

[ ] public double MIN_PRICE = 10.0;

[x] public static final double MIN_PRICE = 10.0;

[ ] public double MIN_PRICE = 10.0;

*Explanation*
`The static modifier, in combination with the final modifier, is also used to define constants. The final modifier indicates that the value of this field cannot change.`

# 19. A Customer class contains an encapsulated array field of Clothing items. 
#     How would you write a getItems method in the Customer class to return these items?

[ ]
public void getItems(Clothing items){
    return items;
}

[x]
public Clothing[] getItems(){
    return items;
}

[ ]
public void getItems(){
    return items;
}

[ ]
public Clothing getItems(){
    return items;
}

*Explanation*
`In the above implementation, the Customer class has one instance variable: items, which is an array of Clothing objects. The getItems method returns the items array`

# 20. 