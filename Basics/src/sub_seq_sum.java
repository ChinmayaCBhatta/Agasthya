import java.util.ArrayList;

public class sub_seq_sum
{
    static void sub_sequence_sum(int i , int arr[], int n, int sum, ArrayList res , int s){
        if(i == n)
        {
            if(s==sum)
            {
                for(Object j : res)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        else{
            res.add(arr[i]);
            sub_sequence_sum(i+1, arr, n, sum, res, s+arr[i]);
            res.remove(res.size()-1);
            sub_sequence_sum(i+1, arr, n, sum, res, s);
        }


    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int sum = 5;
        ArrayList res = new ArrayList();
        sub_sequence_sum(0 ,arr, n, sum, res,0);
    }
}
