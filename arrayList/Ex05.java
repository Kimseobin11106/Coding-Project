package arrayList;

import java.util.ArrayList;

public class Ex05 {


    public static int getSurvivingIndex(int n, int k) {
        ArrayList<Integer> soldiers = new ArrayList<>();

        for (int i=1; i <=n; i++) {
            soldiers.add(i);
        }

        ArrayList<Integer> corpse_list = new ArrayList<>();

        while (n>=2) {
            for (int i = 1; i <= k - 1; i++) {
                soldiers.add(soldiers.get(0));
                soldiers.remove(0);
            }
            corpse_list.add(soldiers.get(0));
            soldiers.remove(0);
            n--;
        }
        for (Integer corpse : corpse_list) {
            System.out.println(corpse + "번 군사가 죽습니다. ");
        }


        return soldiers.get(0);
    }

    public static void main(String[] args) {
        System.out.println(getSurvivingIndex(8, 3));
    }
}
