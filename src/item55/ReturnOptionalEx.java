package item55;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;

public class ReturnOptionalEx {

    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty()) {
            throw new IllegalArgumentException("빈 컬렉션");
        }
        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }
        return result;
    }

    public static <E extends Comparable<E>> Optional<E> max_improved(Collection<E> c) {
        if (c.isEmpty()) {
            return Optional.empty();
        }
        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }
        return Optional.of(result);
    }

    public static <E extends Comparable<E>> Optional<E> max_improved_stream(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        //기본값 가능
        // String lastWordInLexicon = max(word).orElse("단어 없음");

        //원하는 예외 던지기 가능
        // Toy myToy max(toys).orElseThrow(TemperTantrumException::new);

        //항상 값이 채워져 있다고 가정할 때
        // Element lastNobleGas = max(elements.NOBLE_GASES).get();

    }
}


