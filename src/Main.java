public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        System.out.println(arr[0]);
        Employee[] empArr = new Employee[5];

        Employee e1 = new Employee(1, "a", 10000);
        Employee e2 = new Employee(2, "b", 110000);
        Employee e3 = new Employee(3, "c", 120000);
        Employee e4 = new Employee(4, "d", 130000);
        Employee e5 = new Employee(5, "e", 140000);

        empArr[0] = e1;
        empArr[1] = e2;
        empArr[2] = e3;
        empArr[3] = e4;
        empArr[4] = e5;
        //System.out.println(e1);
        System.out.println(empArr[0]);
        System.out.println("=======using for loop=========");
        for (int i = 0; i < empArr.length; i++) {
            System.out.println(empArr[i]);
        }

        System.out.println("=======using for each=========");

        for (Employee e : empArr) {
            System.out.println(e);
        }
        System.out.println("=======using while loop=========");
        int i = 0;
        while (i < empArr.length) {
            System.out.println(empArr[i]);
            i++;
        }

        System.out.println("=======using do while loop=========");
        int j = 0;
        do{
            System.out.println(empArr[j]);
            j++;
        }
        while (j < empArr.length);


    }
}