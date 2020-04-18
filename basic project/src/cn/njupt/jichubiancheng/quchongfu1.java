package cn.njupt.jichubiancheng;

public class quchongfu1 {
    public static void main(String args[]) {
        String X = "ace";
        String Y = "bc";
        String Z = X + Y;//合并
        System.out.println(Z);
        for (int i = 0; i < Z.length(); i++) {
            char c = Z.charAt(i);
            for (int j = i+1;j<Z.length();j++) {
                char cc = Z.charAt(j);
                if (c == cc) {
                    Z = Z.substring(0, j) + Z.substring(j + 1);
                    j--;
                }
            }
        }
        System.out.println(Z);
    }
}
