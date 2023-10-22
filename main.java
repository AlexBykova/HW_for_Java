package org.example;
import java.util.HashMap;



public class Main {
    public static void main(final String[] args) {
        var phonebook = new HashMap<String, String>();
        phonebook.put("87684957306", "Симонов Александр");
        phonebook.put("86638506549", "Бурмистров Олег");
        phonebook.put("82058673966", "Свистопольский Ярослав");
        phonebook.put("84563217856", "Симонов Александр");
        phonebook.put("82314795356", "Свистопольский Ярослав");
        phonebook.put("83124821493", "Анна Леушкина");
        phonebook.put("87516565944", "Анна Леушкина");
        phonebook.put("88465464656", "Анна Леушкина");
        phonebook.put("86874164564", "Василиса Царева");
        phonebook.put("85485134651", "Василиса Царева");
        phonebook.put("86546546546", "Евкакий Аристархов");
        phonebook.put("86987495679", "Василий Пупкин");
        phonebook.put("80497563854", "Василий Пупкин");

        var a = get(phonebook);

        a.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
    }


    public static HashMap<String, Integer> get(HashMap<String, String> dict){
        var result = new HashMap<String, Integer>();
        for (var item : dict.entrySet()) {
            if (result.containsKey(item.getValue())) {
                var key = item.getValue();
                var value = result.get(item.getValue());
                result.replace(key, value + 1);
            } else {
                result.put(item.getValue(), 1);
            }
        }
        return result;
    }
}
