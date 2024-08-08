import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int chongCounter = 0;
        HashMap<String,Boolean> myMap = new HashMap<>();
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            //한줄을 일단 받아서 총총이가 있는지 확인.
            String person1 = st.nextToken();
            String person2 = st.nextToken();
            if(person1.equals("ChongChong") || person2.equals("ChongChong")){
                //둘 중 한명이 총총이면
                myMap.put(person1,true);
                myMap.put(person2,true);
            }else if(myMap.getOrDefault(person1, false) || myMap.getOrDefault(person2, false)){
                //총총이랑 만났었다면
                myMap.put(person1,true);
                myMap.put(person2,true);
            }else{
                //총총이 만나기 전이라면
                myMap.put(person1, false);
                myMap.put(person2, false);
            }
        }

        for (Map.Entry<String,Boolean> entry : myMap.entrySet()){
            if (entry.getValue()){
                chongCounter++;
            }
        }
        System.out.println(chongCounter);    
    }
}