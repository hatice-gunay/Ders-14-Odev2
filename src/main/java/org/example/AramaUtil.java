import java.util.List;
import java.util.Optional;

public class AramaUtil {

    public static <T> int ara(List<T> koleksiyon, T aranan) {
        Optional<T> sonuc = koleksiyon.stream()
                .filter(eleman -> eleman.equals(aranan))
                .findFirst();

        return sonuc.map(eleman -> koleksiyon.indexOf(eleman)).orElse(-1);
    }

    public static void main(String[] args) {
        List<String> stringListesi = List.of("Java", "C++", "Python", "JavaScript");
        System.out.println("Python indexi: " + ara(stringListesi, "Python")); // 2

        List<Integer> integerListesi = List.of(1, 2, 3, 4, 5);
        System.out.println("10 indexi: " + ara(integerListesi, 10)); // -1
    }
}