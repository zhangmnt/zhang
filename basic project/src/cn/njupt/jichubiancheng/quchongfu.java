package cn.njupt.jichubiancheng;

public class quchongfu {
    public static void main(String[] args) {
        String X = "ace";
        String Y= "bc";
        String Z = (X+Y).replaceAll("(.)\\1+", " ");
        System.out.println(Z);
    }
}
