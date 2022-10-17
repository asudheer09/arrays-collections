public class TestIntArray {
    public static void main(String[] args) {
        int[] a= new int[4];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        int[] b= new int[10];
        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];//10
        }
        /*for (int i = 0; i <b.length; i++) {
            System.out.println(b[i]);
        }*/
        b[4]=50;
        b[5]=60;
        b[6]=70;
        b[7]=80;
        int[] c= new int[10];
        for (int i = 0; i < b.length; i++) {
            if(!(b[i]==70 || b[i]==80)){
                c[i]=b[i];
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

    }
}
