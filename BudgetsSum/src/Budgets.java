//1. Create the function that takes an array with objects and returns the sum of people's budgets.
//        ExamplesgetBudgets([
//        { name: "John", age: 21, budget: 23000 },
//        { name: "Steve",  age: 32, budget: 40000 },
//        { name: "Martin",  age: 16, budget: 2700 }
//        ]) ➞ 65700
public class Budgets {
    public static int getBudgetsSum(People [] arr) {
        int sum = 0;
        for (People people : arr) {
            sum += people.budget;
        }
        return sum;
    }
    public static void main (String [] args) {
        People people1 = new People("John", 21, 23000);
        People people2 = new People("Steve", 32, 40000);
        People people3 = new People("Martin", 16, 2700);

        People[] peopleArr = new People[3];
        peopleArr[0] = people1;
        peopleArr[1] = people2;
        peopleArr[2] = people3;

        System.out.println("Sum of all Peoples Budget is : " + getBudgetsSum(peopleArr));

        /*  Output :
            Sum of all Peoples Budget is : 65700
         */
    }
}