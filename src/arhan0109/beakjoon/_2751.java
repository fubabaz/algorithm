package beakjoon;
public class _2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int count = sc.nextInt();
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            num.add(sc.nextInt());
        }
        Collections.sort(num);
        for(int i : num){
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}