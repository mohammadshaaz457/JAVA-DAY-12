import java.util.*;
public class linkedlist
{
    public static void main(String[] args) {
        int arr1[]={2,3,4,56,6};
        int arr2[]={2,3,45,6,67};
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int s:arr1)
        a.add(s);
        for(int s1:arr2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<Integer> u=new HashSet<>(a);
        u.retainAll(b);
        System.out.println(u);


    }
}
