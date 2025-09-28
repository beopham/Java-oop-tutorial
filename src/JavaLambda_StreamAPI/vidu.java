package JavaLambda_StreamAPI;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class vidu {
    public static void main(String[] args) {
        ArrayList <Integer> dayso=new ArrayList<>();
        Random rd=new Random();
        Scanner nhap=new Scanner(System.in);

        System.out.println("Nhập vào số phần tử");
        int sophantu=nhap.nextInt();

        for (int i=0;i<sophantu;i++)
        {
           int songaunhien= rd.nextInt(1,100);
            dayso.add(songaunhien);
        }
        for (int x :dayso)
        {
            System.out.print(x+" ");
        }
        System.out.println(" ");
        System.out.println("dung lambda va stream API");

        dayso.stream().forEach(x-> System.out.print(x +" "));
        System.out.println(" ");
        System.out.println("đếm số lượng");
        System.out.println(dayso.size());

        System.out.println("sắp xếp tăng dần");
        dayso.sort((a,b) ->a-b);
        dayso.stream().forEach(x -> System.out.print(x +" "));
        System.out.println(" ");
        System.out.println("sắp xếp giảm dần");
        dayso.sort((a,b) ->b-a);
        dayso.stream().forEach(x -> System.out.print(x +" "));

        System.out.println(" ");
        long dem = dayso.stream().count();
        System.out.println(dem);


        System.out.println("Sắp xếp giảm dần (dùng Stream):");
        dayso.stream()
                .sorted((a, b) -> b - a) // sắp xếp giảm dần
                .forEach(x -> System.out.print(x + " "));

        System.out.println("đếm ra có bnh số lớn hơn 50 ");
        dayso.stream()
                .filter(x -> x>50)
                .forEach(x-> System.out.print(x +" "));
        System.out.println(" ");
        for (int x :dayso)
        {
            if(x>50)
            {
                System.out.print(x+" ");
            }
        }
        dayso.stream().forEach(x-> System.out.println(x));

    }

}
