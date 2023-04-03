public class Main {
    //Дан массив строк, необходимо
    // a) удалить из него все дубли,
    // б) оставшиеся строки объединить в одну в порядке следования в массиве.
    public static void main(String[] args) {
        String[] strings = {"заяц", "волк", "заяц", "волк", "волк", "крот", "заяц", "дрофа"};

        System.out.println(deletedDuplicates(strings));
    }
    public static StringBuilder deletedDuplicates (String[] strings){
        for (int i = 0; i < strings.length; i++) {
            for (int k = 0; k < strings.length && strings[i] != null; k++) {
                if (strings[i].equals(strings[k]) && i != k) {
                    strings[k] = null;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            if (s != null) {
                sb.append(s + " ");
            }
        }
        return sb;
    }
}
