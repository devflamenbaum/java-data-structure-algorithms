public class Main {

    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack(10);

        arrayStack.push(new Employee("Jane", "Jones", 1));
        arrayStack.push(new Employee("John", "Doe", 2));
        arrayStack.push(new Employee("Mary", "Smith", 3));
        arrayStack.push(new Employee("Mike", "Wilson", 4));
        arrayStack.push(new Employee("Bill", "End", 5));

        //arrayStack.printStack();

        System.out.println(arrayStack.peak());

        System.out.println("Popped: " + arrayStack.pop());
        System.out.println(arrayStack.peak());
    }
}
