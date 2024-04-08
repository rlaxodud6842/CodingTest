class Main {
    public static void main(String[] args) {
        String[] targets = {"ABCD","AABB"};
        String[] keymap = {"ABACD", "BCEFD"};

        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++){
            //targets를 순회한다
            String targetString = targets[i];
            int min = 101;
            int sum = 0;
            for (int j = 0; j < targetString.length(); j++){
                //첫번째 원소를 인덱스로 접근해서
                int compareTarget = targetString.charAt(j);
                for (int k = 0; k < keymap.length; k++){
                    //키멥에 있는지 확인한다 이때 최소 인덱스를 잡아서 제일 적은녀석이 오게 한다.
                    String targetKeymap = keymap[k];
                    if (targetKeymap.indexOf(compareTarget) == -1){
                        sum = -1;
                    }
                    for(int z = 0; z < targetKeymap.length(); z++){
                        String key = targetKeymap.
                        int compareKeymap = targetKeymap.indexOf(compareTarget);

                        if (compareTarget == compareKeymap && min >= compareKeymap){
                            min = compareKeymap;
                            sum += compareKeymap;
                        }
                    }
                }
            }
            answer[i] = sum;
            //한번 순회가 끝나면 하나 넣어준다.
        }
        System.out.print(answer[1]);
    }
}