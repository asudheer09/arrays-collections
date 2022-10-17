public class ObjectArrayExample {
    public static void main(String[] args) {
        Employee e1= new Employee(1,"zyx",12000);

        Object[] objArray= new Object[5];
        objArray[0]=123;
        objArray[1]="sudheer";
        objArray[2]=14.5;
        objArray[3]=true;
        objArray[3]=e1;

        for (Object o:objArray) {
            System.out.println(o);
        }

    }
}
