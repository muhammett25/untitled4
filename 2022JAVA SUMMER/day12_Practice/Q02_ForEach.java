package day12_Practice;

public class Q02_ForEach {
    public static void main(String[] args) {
        String[] list= {"fruits", "vegetables", "meat", "milk"};

        for (String element:list) {
            System.out.println(element+ ":" + element.length());

        }
        System.out.println();
        for (String item: list) {
            if (item.startsWith("v")){
                break;
            }
            System.out.println(item);

        }
    }
}
