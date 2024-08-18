public class BubbleSort {
    public static void main(String[] args) {
        bubbleSort();
    }

    public static void bubbleSort() {
        int [] n = new int[] {5,9,6,2,8};
        System.out.print("before Sorting the Array is:- ");
        for(int k : n)
        {
            System.out.print(k+ " ");
        }
        System.out.println();
        int temp = 0;
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n.length-i-1;j++)
            {
                if(n[j]>n[j+1])
                {
                    temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
            System.out.print("Step-"+ (i+1) + " :- ");
            for(int k : n)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.print("After Sorting The Array is:- ");
        for(int i=0;i<n.length;i++)
        {
            System.out.print(n[i]+ " ");
        }
    }
}
