import java.io.*;
import java.util.*;
//https://www.acmicpc.net/problem/10814
// 람다가 짜세네

class User{
    static int id;
    String name;
    int age;
    public User(String name,int age){
        id += 1;
        this.name = name;
        this.age = age;
    }
}

public  class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        User[] arr = new User[iter];
        for (int i = 0; i < iter; i++){
            String[] temp = br.readLine().split(" ");
            arr[i] = new User(temp[1],Integer.parseInt(temp[0]));
        }
        //나이순, 가입순

        Arrays.sort(arr, (e1, e2) -> {
            if (e1.age == e2.age){
                return e1.id - e2.id;
            }else{
                return e1.age - e2.age;
            }
        });

        for (User user : arr){
            System.out.println(user.age + " " + user.name);
        }
        br.close();
    }
}