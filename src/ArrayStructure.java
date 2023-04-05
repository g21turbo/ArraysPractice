public class ArrayStructure {

    // Array with 50 boxes
    private int[] theArray = new int[50]; // declaring the array with 50 boxes

    // storing the array size
    private int arraySize = 10; // storing the size of the array, initially set to 10


    public void generateRandomArray() { // method to generate random values for the array
        for (int i = 0; i < arraySize; i++) { // loop through the array size
            theArray[i] = (int)(Math.random()*10)+10; // generate a random integer value between 10 and 19 and assign it to the array
        }
    }

    public void printArray() { // method to print the values in the array
        System.out.println("----------"); // print a divider line
        for (int i = 0; i < arraySize; i++) { // loop through the array size
            System.out.print("| " + i + " | "); // print the index of the element
            System.out.println(theArray[i] + " |"); // print the value of the element
            System.out.println("----------"); // print a divider line
        }
    }

    public int getValueAtIndex(int index){ // method to get the value at a specific index
        if (index < arraySize) return theArray[index]; // if the index is within the range of the array size, return the value at that index
        return 0; // otherwise, return 0
    }

    public boolean doesArrayContainThisValue(int searchValue) { // method to check if the array contains a specific value
        boolean valueInArray = false; // initialize a boolean variable to false
        for (int i = 0; i < arraySize; i++) { // loop through the array size
            if (theArray[i] == searchValue) { // if the value at the current index is equal to the search value
                valueInArray = true; // set the boolean variable to true
            }
        }
        return valueInArray; // return the boolean variable indicating if the value was found in the array
    }

    public void deleteIndex(int index) { // method to delete an element at a specific index

        // check if the index is lower than the array size
        if (index < arraySize) {
            for (int i = 0; i < (arraySize - 1); i++) { // loop through the array size minus one
                theArray[i] = theArray[i + 1]; // assign the value of the next element to the current element, effectively deleting the element at the specified index
            }
        }
    }

    public static void main(String[] args) { // main method
        ArrayStructure newArray = new ArrayStructure(); // create a new instance of the ArrayStructure class
        newArray.generateRandomArray(); // generate random values for the array
        newArray.printArray(); // print the array
        System.out.println(newArray.getValueAtIndex(3)); // get the value at index 3 and print it
        System.out.println(newArray.doesArrayContainThisValue(18)); // check if the array contains the value 18 and print the result
    }
}
